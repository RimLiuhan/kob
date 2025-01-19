package com.lh.backend.service.user.account;

import java.util.Map;

/**
 * ClassName:RegisterService
 * Package:com.lh.backend.service.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/19-16:14
 * @version:v1.0
 */
public interface RegisterService {
    public Map<String, String> register(String username, String password, String confirmPassword);
}
