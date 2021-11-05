package com.study.bean;

/**
 * 演示 p命名空间以及 c命名空间
 * p 命名空间注入需要 setter方法
 * c 命名空间注入需要 构造函数
 */
public class Hero {
    private String name;
    private int age;

    // 无参构造
    public Hero(){}

    // 有参构造
    public Hero(String heroName, int heroAge){
        super();
        this.name = heroName;
        this.age = heroAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
