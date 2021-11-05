package com.study.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class AnnotationTest {
    @Test
    public void test() {
        // 定义Spring配置文件路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 获得personAction实例
        PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
        // 调用personAction中的add()方法
        personAction.add();
    }
}
