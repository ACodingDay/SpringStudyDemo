package com.study.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyt
 * 使用 XML 配置文件
 * 演示原型
 */
public class PrototypeTest {
    @Test
    public void test() {
        // 定义Spring配置文件路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 输出获得实例
        System.out.println(applicationContext.getBean("person2"));
        System.out.println(applicationContext.getBean("person2"));
    }
}
