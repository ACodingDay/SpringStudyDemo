package com.study.mybatis4.dao.impl;

import com.study.mybatis4.dao.UserDao;
import com.study.mybatis4.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

/**
 * @author lenovo
 * extends SqlSessionDaoSupport 就不需要 SqlSessionTemplate了
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> selectUser() {
        return getSqlSession().selectList("com.study.mybatis4.mapper.user-mapper.selectAll");
    }
}
