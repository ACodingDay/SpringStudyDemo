package com.study.lifecycle.jsr250specification;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yyt
 * @date 2021年12月07日 22:42
 */
@Component
public class Pen {

    private Integer ink;

    public Pen(){
        System.out.println("买来了钢笔和墨水");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("已经将墨水注入到钢笔中...");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("将钢笔中的墨水都倒掉了...");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}