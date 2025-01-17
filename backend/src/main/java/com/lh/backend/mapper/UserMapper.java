package com.lh.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lh.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UserMapper
 * Package:com.lh.backend.mapper
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/17-16:17
 * @version:v1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
