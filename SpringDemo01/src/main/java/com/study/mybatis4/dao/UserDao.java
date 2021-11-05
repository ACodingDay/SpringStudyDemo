package com.study.mybatis4.dao;

import com.study.mybatis4.entity.User;
import java.util.List;

public interface UserDao {
    public List<User> selectUser();
}
