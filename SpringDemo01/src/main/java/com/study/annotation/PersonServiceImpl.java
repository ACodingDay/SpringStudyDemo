package com.study.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 创建 Service 层接口的实现类
 */
@Service("personService2")
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao2")
    private PersonDao personDao;


    public PersonDao getPersonDao() {
        return personDao;
    }

    @Override
    public void add() {
        // 调用personDao中的add()方法
        personDao.add();
        System.out.println("Service层的add()方法执行了...");
    }
}
