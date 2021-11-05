package com.study.mybatis.dao;

import com.study.mybatis.entity.User;
import java.util.List;

public interface UserDao {
    public List<User> selectUser();
}
