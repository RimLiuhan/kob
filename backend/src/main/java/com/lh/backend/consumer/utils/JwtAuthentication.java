package com.lh.backend.consumer.utils;

import com.lh.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * ClassName:JwtAuthentication
 * Package:com.lh.backend.consumer.utils
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/24-10:48
 * @version:v1.0
 */
public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userId;
    }

}
