package com.study.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    // 代理的目标:真实角色
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成的代理类
    public Object getProxy() {
        /**
         * ClassLoader loader 定义代理类的类加载器
         * @NotNull Class<?>[] interfaces 代理类要实现的接口列表
         * @NotNull reflect.InvocationHandler h 指派方法调用的调用处理程序
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * @param proxy 代理类
     * @param method 代理类的调用处理程序的方法对象
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // chooseHouse();
        log(method.getName());
        Object result = method.invoke(target, args);
        // getBrokerageFee();
        return result;
    }

    // 物色房子
    private void chooseHouse(){
        System.out.println("中介带顾客去挑选出租屋");
    }

    // 事成之后收中介费
    private void getBrokerageFee(){
        System.out.println("中介收取中介费");
    }

    // 拓展业务类：日志
    public void log(String methodName){
        System.out.println("执行了" + methodName + "方法");
    }
}
