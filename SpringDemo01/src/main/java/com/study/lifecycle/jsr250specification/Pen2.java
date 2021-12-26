package com.study.lifecycle.jsr250specification;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yyt
 * @date 2021年12月07日 23:39
 */
public class Pen2 {
    private Integer ink;

    public Pen2() {
        System.out.println("买来了钢笔2和墨水2");
    }

    public void open() {
        System.out.println("init-method - 打开钢笔2...");
    }

    public void close() {
        System.out.println("destroy-method - 合上钢笔2...");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct - 钢笔2中已加满墨水2...");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy - 钢笔2中的墨水2都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}
