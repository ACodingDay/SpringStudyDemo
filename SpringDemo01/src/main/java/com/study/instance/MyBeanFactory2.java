package com.study.instance;

/**
 * 实例工厂类2
 */
public class MyBeanFactory2 {
    public MyBeanFactory2() {
        System.out.println("People3工厂实例化中...");
    }

    // 创建Bean的方法，没有 static 修饰
    public People3 createBean() {
        return new People3();
    }
}
