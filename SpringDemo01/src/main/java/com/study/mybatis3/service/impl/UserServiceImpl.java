package com.study.mybatis3.service.impl;

import com.study.mybatis3.dao.UserMapper;
import com.study.mybatis3.entity.User;
import com.study.mybatis3.service.UserService;

import java.util.List;

/**
 * @author lenovo
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }
}
