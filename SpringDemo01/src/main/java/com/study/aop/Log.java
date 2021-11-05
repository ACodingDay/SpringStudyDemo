package com.study.aop;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * 1.前置通知
 */
public class Log implements MethodBeforeAdvice {

    /**
     * 在实现操作业务之前首先要先做一些日志信息
     * @param method 要执行的目标对象的方法
     * @param objects 参数，对象数组
     * @param o 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() +"方法被执行");
    }
}
