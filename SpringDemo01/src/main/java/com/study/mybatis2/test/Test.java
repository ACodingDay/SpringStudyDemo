package com.study.mybatis2.test;

import com.study.mybatis2.dao.UserDao;
import com.study.mybatis2.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis2.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        List<User> list = userDao.selectUser();
        // 输出数据表 user的长度
        System.out.println("数据表的长度：" + list.size());
        for (User u : list) {
            System.out.println("用户的id - " + u.getId());
            System.out.println("用户的姓名 - " + u.getName());
            System.out.println("用户的密码 - " + u.getPwd());
            System.out.println("----------");
        }
    }
}
