package com.study.lifecycle.initmethod;

/**
 * @author yyt
 * @date 2021年12月07日 20:47
 * 使用 XML 配置文件配置
 */
public class Cat {

    private String name;

    public Cat() {
        System.out.println("Cat的构造方法执行了...");
    }

    public void setName(String name) {
        System.out.println("Cat的setName方法执行了...");
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
