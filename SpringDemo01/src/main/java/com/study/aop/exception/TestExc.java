package com.study.aop.exception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExc {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        CalculatorService cl = (CalculatorService) context.getBean("calculatorService");
        // 将方法返回值改为 int，才会抛出异常
        int ans = cl.numDiv(100, 0);
        // 如果方法返回值是 double，那么输出结果 Infinity
        System.out.println(ans);
    }
}
