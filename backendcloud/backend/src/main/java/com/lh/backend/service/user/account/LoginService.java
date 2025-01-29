package com.lh.backend.service.user.account;

import java.util.Map;

/**
 * ClassName:LoginService
 * Package:com.lh.backend.service.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/19-16:13
 * @version:v1.0
 */
public interface LoginService {
    public Map<String, String> getToken(String username, String password);
}
