package com.study.lifecycle.initmethod;

/**
 * @author yyt
 * @date 2021年12月07日 20:49
 */
public class Dog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init() {
        System.out.println(name + "被初始化了...");
    }

    public void destroy() {
        System.out.println(name + "被销毁了...");
    }
}
