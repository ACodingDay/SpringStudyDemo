package com.study.instance;

import com.study.instance.bean.Car;
import com.study.instance.bean.People;
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
        applicationContext.getBeansOfType(People.class).forEach((beanName, p) -> {
            System.out.println(beanName + " : " + p);
        });
        // 尝试取一下静态工厂，抛出异常，说明静态工厂本身不会被注册到 IOC 容器中
        // System.out.println(applicationContext.getBean(PeopleStaticFactory.class));
    }

    @Test
    public void test2() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        applicationContext.getBeansOfType(Car.class).forEach((beanName, c) -> {
            System.out.println(beanName + " : " + c);
        });
    }
}
