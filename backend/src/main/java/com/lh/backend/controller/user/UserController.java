package com.lh.backend.controller.user;

import com.lh.backend.mapper.UserMapper;
import com.lh.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:UserController
 * Package:com.lh.backend.controller.user
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/17-15:43
 * @version:v1.0
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public User getUser(@PathVariable int userId) {
        return userMapper.selectById(userId);
    }

    @GetMapping("/user/add/{userId}/{username}/{password}/")
    public String addUser(@PathVariable int userId, @PathVariable String username, @PathVariable String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User(userId, username, encodedPassword);
        userMapper.insert(user);
        return "add success";
    }

    @GetMapping("/user/delete/{userId}/")
    public String deleteUser(@PathVariable int userId) {
        userMapper.deleteById(userId);
        return "delete success";
    }
}
