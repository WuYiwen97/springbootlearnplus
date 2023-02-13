package com.antaiib.commons.exceptions;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import com.antaiib.commons.result.Result;
import com.antaiib.tools.token.TokenUtil;
import com.antaiib.tools.token.vo.TokenVo;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author xxx
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_DELETE = "DELETE";

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static final class UnexpectError<T> extends Result<T> {
        private final String debug;

        public UnexpectError(Result<T> result, String debug) {
            setCode(result.getCode());
            setMsg(result.getMsg());
            setData(result.getData());
            this.debug = debug;
        }
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public Result<?> handleValidException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        String clazzName = ex.getParameter().getContainingClass().getName();
        String method = ex.getParameter().getMethod().getName();
        log.error("参数校验异常:{}类的{}方法参数{}({})", clazzName, method, fieldError.getDefaultMessage(), fieldError.getField());
        return Result.failure(new Result.Error(Result.ILLEGAL_PARAMETER.getCode(), fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public Result<?> handleBindException(BindException ex) {
        log.error("参数校验异常:{}", "后端缺少@RequestBody或暂时不支持该种传参校验方式");
        return Result.failure(new Result.Error(Result.ILLEGAL_PARAMETER.getCode(), "后端缺少@RequestBody或暂时不支持该种传参校验方式"));
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public Result<?> handle(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
        String message = null;
        for (ConstraintViolation<?> item : violations) {
            message = item.getMessage();
            log.error("参数校验异常:{}", message);
            break;
        }
        return Result.failure(new Result.Error(Result.ILLEGAL_PARAMETER.getCode(), message));
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<?> handle(HttpServletRequest req, Exception e) {
        if (e instanceof FsnException) {
            return Result.failure(((FsnException) e).getError());
        } else {
            List<String> prints = new LinkedList<>();
            String requestMethod = req.getMethod();
            //输出请求方法和地址
            prints.add(requestMethod + " " + req.getRequestURL());
            if (METHOD_GET.equalsIgnoreCase(requestMethod) || METHOD_DELETE.equalsIgnoreCase(requestMethod)) {
                //GET或DELETE方法，直接打印参数即可
                prints.addAll(printParams("REQ参数", req.getParameterMap()));
            } else if (METHOD_POST.equalsIgnoreCase(requestMethod) || METHOD_PUT.equalsIgnoreCase(requestMethod)) {
                //POST或PUT方法，先打印Content-Type
                String contentType = req.getHeader("content-type");
                if (!StrUtil.isEmpty(contentType) && contentType.contains("urlencoded")) {
                    //urlencoded类型请求体，直接打印参数即可
                    prints.add("Content-Type：" + contentType);
                    prints.addAll(printParams("REQ参数", req.getParameterMap()));
                } else if (!StrUtil.isEmpty(contentType) && contentType.contains("multipart")) {
                    //multipart类型请求体
                    //先打印URL参数
                    prints.addAll(printParams("URL参数", parseParams(req.getQueryString())));
                    //再解析并打印BODY参数
                    prints.add("Content-Type：" + contentType);
                    try {
                        for (Part part : req.getParts()) {
                            if (StrUtil.isEmpty(part.getSubmittedFileName()) && StrUtil.isEmpty(part.getContentType())) {
                                prints.add("BODY表单：" + part.getName() + " ==> " + IoUtil.readUtf8(part.getInputStream()));
                            } else {
                                prints.add("BODY文件：" + part.getName() + " ==> 文件名：" + part.getSubmittedFileName() + "，长度：" + part.getSize() + "bytes");
                            }
                        }
                    } catch (Exception ex) {
                        prints.add("BODY参数：解析出错");
                    }
                } else {
                    //其他类型请求体
                    //先打印URL参数
                    prints.addAll(printParams("URL参数", parseParams(req.getQueryString())));
                    //再解析并打印BODY内容
                    prints.add("Content-Type：" + (StrUtil.isEmpty(contentType) ? "<未知>" : contentType));
                    try (InputStream inStream = req.getInputStream()) {
                        if (inStream != null) {
                            String body = IoUtil.readUtf8(inStream);
                            if (!StrUtil.isEmpty(body)) {
                                if (body.length() > 256) {
                                    body = body.substring(0, 256) + "...共" + body.length() + "个字符";
                                }
                                prints.add("BODY内容：" + body);
                            }
                        }
                    } catch (Exception ex) {
                        prints.add("BODY内容：解析出错");
                    }
                }
            } else {
                prints.add("无法解析 " + requestMethod + " 方法的参数");
            }

            prints.add("");
            //prints.add(printAuth(req));

            prints.add("");
            boolean aterror = false;
            List<String> debugs = new LinkedList<>();
            for (Throwable tr = e; tr != null; tr = e.getCause() == tr ? null : e.getCause()) {
                prints.add("异常信息：" + tr.toString());
                debugs.add("异常信息：" + tr.toString());
                for (StackTraceElement element : tr.getStackTrace()) {
                    if (element.getClassName().startsWith("com.antaiib") || element.getClassName().startsWith("cn.atfusion")) {
                        prints.add(element.toString());
                        debugs.add(element.toString());
                        aterror = true;
                    }
                }
            }
            log.error("\n==============================【 智能异常信息 】==============================\n" + StrUtil.join("\n",prints) + "\n-----------------------------------------------------------------------------");
            if (!aterror) {
                debugs.add("未解析到错误代码行数，详细信息请查看日志");
                e.printStackTrace();
            }
//            if (e instanceof RpcException) {
//                return Result.failure(Result.SYSTEM_DUBBO_RPC);
//            } else if (e instanceof TimeoutException) {
//                return Result.failure(Result.SYSTEM_DUBBO_TIMEOUT);
//            } else {
                return new UnexpectError<>(Result.failure(Result.SYSTEM_ERROR), StrUtil.join("\n",debugs));
            //}
        }
    }

    @Nonnull
    private static Map<String, String[]> parseParams(@Nullable String str) {
        if (StrUtil.isEmpty(str)) {
            return new HashMap<>();
        } else {
            Map<String, String[]> queryParams = new HashMap<>();
            for (String kv : str.split("&")) {
                String[] temp = kv.split("=");
                String[] vals = queryParams.get(temp[0]);
                if (vals == null || vals.length < 1) {
                    vals = new String[]{temp[1]};
                } else {
                    vals = Arrays.copyOf(vals, vals.length + 1);
                    vals[vals.length - 1] = temp[1];
                }
                queryParams.put(temp[0], vals);
            }
            return queryParams;
        }
    }

    private static List<String> printParams(String type, Map<String, String[]> params) {
        List<String> prints = new LinkedList<>();
        if (!params.isEmpty()) {
            for (Map.Entry<String, String[]> entry : params.entrySet()) {
                String[] value = entry.getValue();

                String display;
                if (value == null || value.length == 0) {
                    display = "<无>";
                } else if (value.length == 1) {
                    display = "\"" + value[0] + "\"";
                } else {
                    List<String> list = new ArrayList<>(value.length);
                    for (String s : value) {
                        list.add("\"" + s + "\"");
                    }

                    display = "[" + StrUtil.join(",",list)  + "]";
                }
                prints.add(type + "：" + entry.getKey() + " ==> " + display);
            }
        }
        return prints;
    }

    /*private static String printAuth(HttpServletRequest req) {
        String userId, appId, indusId;

        String token = req.getHeader("AT-TOKEN");
        token = StrUtil.isEmpty(token) ? req.getParameter("AT-TOKEN") : token;
        if (StrUtil.isEmpty(token)) {
            userId = "<无>";
        } else {
            LoginUserVO loginUserVO = TokenUtil.unsign(token, new TypeToken<TokenVo<LoginUserVO>>() {
            }.getType());
            if (loginUserVO == null) {
                userId = "<无>";
            } else {
                userId = String.valueOf(loginUserVO.getId());
            }
        }

        appId = req.getHeader("AT-APPCLIENT");
        appId = StrUtil.isEmpty(appId) ? req.getParameter("AT-APPCLIENT") : appId;
        appId = StrUtil.isEmpty(appId) ? "<无>" : appId;

        indusId = req.getHeader("AT-INDUSTRYID");
        indusId = StrUtil.isEmpty(indusId) ? req.getParameter("AT-INDUSTRYID") : indusId;
        indusId = StrUtil.isEmpty(indusId) ? "<无>" : indusId;

        return "鉴权信息：userId：" + userId + "，appId：" + appId + "，indusId：" + indusId;
    }*/
}
