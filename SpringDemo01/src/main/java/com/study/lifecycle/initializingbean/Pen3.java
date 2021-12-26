package com.study.lifecycle.initializingbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author yyt
 * @date 2021年12月08日 0:58
 * 演示 InitializingBean 与 DisposableBean 接口的使用
 */
@Component
public class Pen3 implements InitializingBean, DisposableBean {

    private Integer ink;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("钢笔3中已加满墨水了...");
        this.ink = 100;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("钢笔3中的墨水完全清理了...");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}