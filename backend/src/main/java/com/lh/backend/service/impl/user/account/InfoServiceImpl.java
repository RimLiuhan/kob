package com.lh.backend.service.impl.user.account;

import com.lh.backend.pojo.User;
import com.lh.backend.service.impl.utils.UserDetailsImpl;
import com.lh.backend.service.user.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:InfoServiceImpl
 * Package:com.lh.backend.service.impl.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/20-16:09
 * @version:v1.0
 */
@Service
public class InfoServiceImpl implements InfoService {

    @Override
    public Map<String, String> getInfo() {
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        User user = loginUser.getUser();

        Map<String, String> map = new HashMap<>();
        map.put("error_message", "success");
        map.put("id", user.getId().toString());
        map.put("username", user.getUsername());
        map.put("photo", user.getPhoto());
        return map;
    }
}
