package com.study.lifecycle.initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年12月08日 1:04
 */
public class InitializingDisposableAnnoApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器...");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.lifecycle.initializingbean");
        System.out.println("IOC容器初始化完成...");
        System.out.println();
        System.out.println("准备销毁IOC容器...");
        ctx.close();
        System.out.println("IOC容器销毁完成...");
    }
}
