package com.study.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 转换为 Student 类型对象
        Student stu = (Student) context.getBean("stu");
        stu.show();
        // 测试 P命名空间
        Hero hero = (Hero) context.getBean("myHero");
        System.out.println(hero);
        // 测试 C命名空间
        Hero hero2 = (Hero) context.getBean("hero2");
        System.out.println(hero2);
    }
}
