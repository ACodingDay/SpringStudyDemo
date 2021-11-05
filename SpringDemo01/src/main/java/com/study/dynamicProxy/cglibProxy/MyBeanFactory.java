package com.study.dynamicProxy.cglibProxy;

import com.study.dynamicProxy.jdkProxy.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * 代理类
 */
public class MyBeanFactory {
    public static GoodsDao getBean() {
        // 准备目标类
        final GoodsDao goodsDao = new GoodsDao();
        // 创建切面类实例
        final MyAspect myAspect = new MyAspect();
        // 生成代理类，CGLIB在运行时，生成指定对象的子类，增强
        Enhancer enhancer = new Enhancer();
        // 确定需要增强的类
        enhancer.setSuperclass(goodsDao.getClass());
        // 添加回调函数
        enhancer.setCallback(new MethodInterceptor() {
            // intercept 相当于 jdk invoke，前三个参数与 jdk invoke—致
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 前增强
                myAspect.myBefore();
                // 目标方法执行
                Object obj = method.invoke(goodsDao, args);
                // 后增强
                myAspect.myAfter();
                return obj;
            }
        });
        // 创建代理类
        GoodsDao goodsDaoProxy = (GoodsDao) enhancer.create();
        return goodsDaoProxy;
    }
}
