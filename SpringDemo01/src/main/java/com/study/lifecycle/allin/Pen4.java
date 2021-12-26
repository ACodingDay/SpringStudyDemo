package com.study.lifecycle.allin;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yyt
 * @date 2021年12月08日 20:05
 * 演示三种生命周期共存
 */
@Component
public class Pen4 implements InitializingBean, DisposableBean {

    private Integer ink;

    public void open() {
        System.out.println("init-method - 打开钢笔4...");
    }

    public void close() {
        System.out.println("destroy-method - 合上钢笔4...");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct注解 - 钢笔4中已加满墨水...");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy注解- 钢笔4中的墨水都放干净了...");
        this.ink = 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - 准备写字...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - 写完字了...");
    }
}
