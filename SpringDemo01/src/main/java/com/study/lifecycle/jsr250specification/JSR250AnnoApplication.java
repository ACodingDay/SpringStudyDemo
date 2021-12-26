package com.study.lifecycle.jsr250specification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年12月07日 23:27
 */
public class JSR250AnnoApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器...");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.lifecycle.jsr250specification");
        System.out.println("IOC容器初始化完成...");
        System.out.println();
        System.out.println("准备销毁IOC容器...");
        // 关闭容器
        ctx.close();
        System.out.println("IOC容器销毁完成...");
    }
}
