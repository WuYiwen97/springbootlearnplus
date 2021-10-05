package com.wuyiwen.controller;


import com.wuyiwen.jwtToken.CheckToken;
import com.wuyiwen.jwtToken.PassToken;
import com.wuyiwen.pojo.UserInfo;
import com.wuyiwen.service.TokenService;
import com.wuyiwen.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/26
 * @Description :
 **/

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserInfoService userService;
    @Autowired
    TokenService tokenService;

    @Value("${EXPIRE_TIME}")
    private String EXPIRE_TIME;

    @CheckToken
    @GetMapping("/getUserByName/{userName}")
    public String getUser(@PathVariable("userName") String userName) {
        UserInfo userInfoByName = userService.getUserInfoByName(userName);
        return userInfoByName.toString();

    }

    //注册
    @PassToken
    @PostMapping("/register")
    public String register(@RequestBody  Map map) {
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String encodePwd = bCryptPasswordEncoder.encode(String.valueOf(map.get("password")));
        UserInfo userInfo=new UserInfo();
        userInfo.setUI_USER_NAME(String.valueOf(map.get("username")));
        userInfo.setUI_PASSWORD(encodePwd);
        userInfo.setUI_STATUS("0");
        userInfo.setUI_CREATE_TIME(System.currentTimeMillis());
        userInfo.setUI_ROLES(String.valueOf(map.get("roles")));

        int i = userService.addUser(userInfo);
        if (i==1){
            return "注册成功";
        }
        return "注册失败";

    }

    //登录

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map user){
        Map result=new HashMap();
        UserInfo userForBase=userService.getUserInfoByName(String.valueOf(user.get("username")));
        if(userForBase==null){
            result.put("message","登录失败,用户不存在");
            return result;
        }else {
            BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
            String dbPwd=userForBase.getUI_PASSWORD();
            boolean matchesResult = bCryptPasswordEncoder.matches(String.valueOf(user.get("password")),dbPwd);
            if (!matchesResult){
                result.put("message","登录失败,密码错误");
                return result;
            }else {
                //过期时间是 现在加上 30min
                Date expiresDate = new Date(System.currentTimeMillis()+Integer.valueOf(EXPIRE_TIME)*60*1000);
                String token = tokenService.getToken(userForBase,expiresDate);
                result.put("token", token);
                result.put("expireTime", EXPIRE_TIME);
                result.put("userId", userForBase.getUI_ID());
                return result;
            }
        }
    }
    @CheckToken
    @GetMapping("/afterLogin")
    public String afterLogin(){
        return "你已通过验证,成功进入系统";
    }


}
