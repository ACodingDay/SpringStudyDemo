package com.study.instance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    @Test
    public void test() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取id为people1的实例
        System.out.println(applicationContext.getBean("people1"));
    }

    @Test
    public void test2() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取id为 people2实例
        System.out.println(applicationContext.getBean("people2"));
    }

    @Test
    public void test3() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取id为 people3实例
        System.out.println(applicationContext.getBean("people3"));
    }
}
