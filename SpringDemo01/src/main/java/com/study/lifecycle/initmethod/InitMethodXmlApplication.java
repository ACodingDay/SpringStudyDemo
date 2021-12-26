package com.study.lifecycle.initmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyt
 * @date 2021年12月07日 21:27
 * 演示 Bean 的初始化流程
 * 先构造对象，再给属性赋值，然后才执行 init-method
 */
public class InitMethodXmlApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器...");
        // XML 配置文件 —— "applicationContext.xml"
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注解配置 —— LifeCycleConfig.class
        // AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        System.out.println("IOC容器初始化完成...");
        System.out.println();
        System.out.println("准备销毁IOC容器...");
        // 调用 close() 方法对容器进行关闭，以触发 Bean 的销毁动作
        ctx.close();
        System.out.println("IOC容器销毁完成...");
    }
}
