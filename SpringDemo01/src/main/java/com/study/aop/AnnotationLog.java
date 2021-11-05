package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 添加注解@Aspect 表示这个类是一个切面类
 */
@Aspect
public class AnnotationLog {
    /**
     * @Before 添加切入点，原本写在 XML配置文件的，写在这里了
     */
    @Before("execution(* com.study.aop.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("【注解-BEFORE】方法执行之前");
    }

    /**
     * @After 添加切入点，原本写在 XML配置文件的，写在这里了
     */
    @After("execution(public * com.study.aop.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("【注解-AFTER】方法执行之后");
    }

    /**
     * 在环绕通知中，可以给定一个参数，代表我们要获取的切入的点
     *
     * @param pj
     * @throws Throwable
     */
    @Around("execution(public * com.study.aop.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("【INFO】使用环绕之前");
        // 签名就是方法签名
        System.out.println("【INFO】获得签名：" + pj.getSignature());
        // 执行proceed() 会得到一个返回结果
        Object result = pj.proceed();
        System.out.println("【INFO】获得执行对象：" + result);
        System.out.println("【INFO】使用环绕之后");
    }
}
