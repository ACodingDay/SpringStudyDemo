package com.study.mybatis3.dao;

import com.study.mybatis3.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lenovo
 */
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectUser();
}
