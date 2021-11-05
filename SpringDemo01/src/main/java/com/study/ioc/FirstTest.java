package com.study.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * test1：对象的创建并不是通过关键字 new 去新建一个类完成的；
 * 而是由 Spring 容器管理实现的。
 * 这就是 Spring IoC 容器思想的工作机制。
 * test2：依赖注入，通过 setter属性注入
 */
public class FirstTest {

    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();
        // 由测试类（客户端）自定义接口实现类
        personService.setPersonDao(new PersonDaoImpl());
        // personService.setPersonDao(new XXXX());
        personService.addPerson();
    }

    @Test
    public void test1() {
        // 定义Spring配置文件的路径，需要把 config文件夹设置为 Resources
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器中bean的id获取personDao实例
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        // 调用 personDao 的 add ()方法
        personDao.add();
    }

    @Test
    public void test2() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器中bean的id获取personService实例
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        // 调用personService的addPerson()方法
        personService.addPerson();
    }
}
