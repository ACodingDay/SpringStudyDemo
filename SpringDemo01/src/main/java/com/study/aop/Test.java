package com.study.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        UserServices service = (UserServices) context.getBean("userService");
        // 动态代理代理的是接口，实现类不需要被代理
        UserServices service2 = context.getBean("userService", UserServices.class);
        service.add();
        service.delete();
        service.search();
        service.update();
    }
}
