package com.study.awareuse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author yyt
 * @date 2021年11月21日 15:35
 * 回调注入 ApplicationContextAware
 */
public class AwaredTestBean implements ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        // 当这个 AwaredTestBean 被初始化好的时候，就会把 ApplicationContext 传给它，
        this.ctx = ctx;
    }

    public void printBeanNames() {
        // 测试，打印一下 IOC 容器内部的所有 bean 的名称
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
