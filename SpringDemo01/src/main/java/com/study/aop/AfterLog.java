package com.study.aop;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

/**
 * 1.后置通知，并且接收返回值
 */
public class AfterLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为" + returnValue);
    }
}
