package com.study.bean;

/**
 * Spring 第一个程序
 */
public class Hello {
    private String name;

    // 无参构造方法：验证 Hello 是否被创建了
    public Hello() {
        System.out.println("Hello 被创建了");
    }

    // 有参构造
    public Hello(String name) {
        super();
        this.name = name;
    }

//    public void setName1(String name) {
//        this.name = name;
//    }

    public void show() {
        System.out.println("Hello, " + name);
    }
}
