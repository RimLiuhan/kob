package com.lh.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:User
 * Package:com.lh.backend.pojo
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/17-16:12
 * @version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
