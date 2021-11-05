package com.study.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
        // 解析 xml 文件，生成管理对应的 bean对象
        // ApplicationContext 也可以改为 BeanFactory
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 转换为 Hello 类型对象
        Hello hello = (Hello)context.getBean("h1");

        // ApplicationContext.getBean(xxx.class) 也可以得到对象
        Hello hello2 = context.getBean(Hello.class);
        hello2.show();
    }
}
