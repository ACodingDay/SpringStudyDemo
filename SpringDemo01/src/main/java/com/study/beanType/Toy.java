package com.study.beanType;

/**
 * @author yyt
 * @date 2021年12月05日 19:17
 * 抽象玩具类
 */
public abstract class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
