package com.study.scope.bean;

/**
 * 演示 单例
 * @author yyt
 */
public class Child {
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }
}
