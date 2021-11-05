package com.study.mybatis2.dao;

import com.study.mybatis2.entity.User;
import java.util.List;

public interface UserDao {
    public List<User> selectUser();
}
