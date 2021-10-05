package com.wuyiwen.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.wuyiwen.pojo.UserInfo;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * @Author : JCccc
 * @CreateTime : 2019/11/27
 * @Description :
 **/
@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public String getToken(UserInfo user, Date date) {
        String token="";

        token= JWT.create()
                .withAudience(String.valueOf(user.getUI_ID()))
                .withExpiresAt(date) //过期时间配置
                .sign(Algorithm.HMAC256(user.getUI_PASSWORD()));

        return token;
    }
}
