package com.study.mybatis.dao.impl;

import com.study.mybatis.dao.UserDao;
import com.study.mybatis.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        // 返回数据库之前，插入测试数据
        User user = new User();
        user.setName("黑天鹅");
        user.setPwd("20210626");
        // 新增用户
        sqlSession.insert("com.study.mybatis.mapper.user-mapper.add", user);
        return sqlSession.selectList("com.study.mybatis.mapper.user-mapper.selectAll");
    }
}
