package com.study.aop.exception;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.ThrowsAdvice;
import java.util.Arrays;

/**
 * 异常通知切面类
 * 需要实现 ThrowsAdvice 接口，虽然没有必须要实现的接口方法
 * 但是必须要实现 afterThrowing()方法来实现通知的具体内容
 */
public class ExceptionLog implements ThrowsAdvice {

    /**
     * 异常通知
     *
     * @param joinPoint 代表当前拦截的方法对象，使用该对象可以获取拦截方法的信息（例如：类名，方法名，方法参数等）
     * @param ex        该变量为目标方法传递过来的异常对象，里面包含异常信息
     */
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        System.out.println("代理对象类型：" + joinPoint.getThis().getClass());
        System.out.println("拦截的方法名称：" + joinPoint.getSignature().getName());
        System.out.println("拦截方法的参数列表：" + Arrays.asList(joinPoint.getArgs()));
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法：" + methodName + "，发生了异常： " + ex.getMessage());
    }

}
