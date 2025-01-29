package com.lh.backend.service.impl.user.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lh.backend.mapper.UserMapper;
import com.lh.backend.pojo.User;
import com.lh.backend.service.user.account.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:RegisterServiceImpl
 * Package:com.lh.backend.service.impl.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/20-16:48
 * @version:v1.0
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password, String confirmPassword) {
        Map<String, String> map = new HashMap<>();
        if (username == null || password == null || confirmPassword == null) {
            map.put("error_message", "用户名, 密码, 确认密码不能为空");
            return map;
        }

        username = username.trim();
        if (username.length() == 0) {
            map.put("error_message", "用户名不能为空");
            return map;
        }
        if (password.length() > 100 || confirmPassword.length() > 100) {
            map.put("error_message", "密码长度不能大于100");
            return map;
        }
        if (username.length() > 100) {
            map.put("error_message", "用户名长度不能大于100");
            return map;
        }
        if (password.length() == 0 || confirmPassword.length() == 0) {
            map.put("error_message", "密码不能为空");
            return map;
        }

        if (!password.equals(confirmPassword)) {
            map.put("error_message", "两次密码输入不一致");
            return map;
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<User> users = userMapper.selectList(queryWrapper);
        if (!users.isEmpty()) {
            map.put("error_message", "用户名已被注册");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);
        String photo = "https://i0.hdslb.com/bfs/face/12738edc548054b9e63d712c0ef45a1f38147517.jpg@240w_240h_1c_1s_!web-avatar-nav.avif";
        User user = new User(null, username, encodedPassword, photo, 1500);
        userMapper.insert(user);

        map.put("error_message", "success");
        return map;
    }
}
