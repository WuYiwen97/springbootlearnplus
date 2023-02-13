package com.antaiib.commons.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> {
    public static final Error SYSTEM_ERROR = new Error("-1", "系统异常");
    public static final Error PARAMS_ABSENT = new Error("-2", "请求参数为空");
    public static final Error SYSTEM_DUBBO_RPC = new Error("-3", "微服务之间交互失败");
    public static final Error SYSTEM_DUBBO_TIMEOUT = new Error("-4", "微服务之间接口请求超时");
    public static final Error FORBIDDEN = new Error("-5", "非法请求");
    public static final Error ILLEGAL_PARAMETER = new Error("-6", "非法参数");
    public static final Error MATEERR = new Error("-7", "实体与实体类型不匹配");
    public static final Error PARAMS_ABSENT_NO_USERCONTEXT = new Error("-8", "没有获得usercontext");
    public static final Error PARAMS_PAGE_ERROR = new Error("-9", "分页参数请求错误");
    public static final Error PARAMS_ERROR = new Error("-10", "查询不到此数据");
    public static final Error PARAMS_DATETIME_ERROR = new Error("-11", "参数日期格式错误");
    public static final Error TABLE_NAME_ABSENT = new Error("-12", "无法获取实体映射表名");
    public static final Error GENERATOR_ID_ERROR = new Error("-13", "实体ID生成写入失败");
    public static final Error EXIST_ASSOCIATION_RELATIONSHIP = new Error("-14", "被删除数据存在关联信息");
    public static final Error TIME_ERROR = new Error("-15", "时间有误：超出一天时间范围或格式有误");
    public static final Error Insert_ERROR = new Error("-15", "数据添加失败");
    public static final Error UPLODE_ERROR = new Error("-16", "上传失败");
    public static final Error UPLODE_UNFIND_ERROR = new Error("-17", "上传文件不存在");
    public static final Error PARAMS_LIMIT = new Error("-18", "集合参数最多允许传入500个，请分批操作");
    public static final Error AUTO_NUMBER_ERROR = new Error("-19", "无法获取自动编码");
    public static final Error AUTO_NUMBER_SIZE_ERROR = new Error("-20", "获取自动编码数量不匹配");
    public static final Error PARAMS_FORMAT_ERROR = new Error("-21", "参数格式错误");
    public static final Error PARAMS_LENGTH_ERROR = new Error("-22", "参数过长");
    public static final Error PARAMS_EMPTY_ERROR = new Error("-23", "请输入处理内容");
    public static final Error DATA_FORMAT_TYPE_NOT_EXIST_ERROR = new Error("-24", "要转换的格式不存在，请检查要转的格式");
    public static final Error PROMPT = new Error("-25", "标签或应用不存在，请先添加再绑定应用");
    public static final Error USER_NOT_EXISTS = new Error("-26", "请求用户不存在");
    public static final Error USER_NOT_LOGIN = new Error("-27", "用户未扫码登录");
    public static final Error QRCODE_EXPIRETIME = new Error("-28", "二维码已过期");
    public static final Error TREE_TYPE_ERROR = new Error("-29", "设备树类型错误，请输入1或4");

    public static final Error REPEAT = new Error("-29", "应用与标签已经绑定，请勿重复绑定");
    /**
     * 错误码
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体数据内容
     */
    private T data;

    /**
     * 封装成功消息
     *
     * @param data 消息的数据
     * @param <D>  数据的结构
     * @return 成功消息
     */
    public static <D> Result<D> success(D data) {
        Result<D> result = new Result<>();
        result.code = "0";
        result.setMsg("成功");
        result.setData(data);
        return result;
    }

    /**
     * 封装错误消息
     *
     * @param error 错误信息
     * @return 错误消息
     */
    public static <T> Result<T> failure(Error error) {
        Result<T> result = new Result<>();
        result.code = error.code;
        result.setMsg(error.msg);
        return result;
    }

    @Data
    public static final class Error extends Throwable implements Serializable {
        private static final long serialVersionUID = 2695807747621989141L;

        private final String code;
        private final String msg;

        public Error(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
}
