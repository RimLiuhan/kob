package com.lh.backend.service.impl.user.account;

import com.lh.backend.pojo.User;
import com.lh.backend.service.impl.utils.UserDetailsImpl;
import com.lh.backend.service.user.account.LoginService;
import com.lh.backend.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:LoginService
 * Package:com.lh.backend.service.impl.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/19-16:17
 * @version:v1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Map<String, String> getToken(String username, String password) {
        // 创建用户密码认证令牌
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(username, password);
        // 用户身份验证
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        // 获取认证后的用户信息
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticate.getPrincipal();
        User user = loginUser.getUser();

        //生成jwt令牌
        String jwt = JwtUtil.createJWT(user.getId().toString());

        Map<String, String> map = new HashMap<>();
        map.put("error_message", "success");
        map.put("token", jwt);
        return map;
    }
}
