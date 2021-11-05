package com.study.annotation;

import org.springframework.stereotype.Repository;

/**
 * 创建 DAO 层接口的实现类
 * 注解 @Repository 用于将数据访问层（DAO层）的类标识为 Spring 中的 Bean
 */
@Repository("personDao2")
public class PersonDaoImpl implements PersonDao{
    @Override
    public void add() {
        System.out.println("Dao层的add()方法执行了...");
    }
}
