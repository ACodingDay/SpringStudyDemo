package com.study.beanType;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author yyt
 * @date 2021年12月05日 19:19
 * 玩具工厂类
 * 让它实现 FactoryBean 接口，并覆写其中的方法
 */
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    // setter 注入
    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null；之前的1.x版本是不允许的
                return null;
        }
    }

    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
