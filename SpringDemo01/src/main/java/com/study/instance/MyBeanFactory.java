package com.study.instance;

public class MyBeanFactory {
    // 创建Bean实例的静态工厂方法
    public static People2 createBean() {
        return new People2();
    }
}
