package com.study.lifecycle.allin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年12月18日 14:57
 * 测试三种生命周期并存的优先级
 */
public class InitializingAllMethodApplication {
    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器...");
        // 驱动配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Pen4Configuration.class);
        System.out.println("IOC容器初始化完成...");
        System.out.println();
        System.out.println("准备销毁IOC容器...");
        ctx.close();
        System.out.println("IOC容器销毁完成...");
    }
}
