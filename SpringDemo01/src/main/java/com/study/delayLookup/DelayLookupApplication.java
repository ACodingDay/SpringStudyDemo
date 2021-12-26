package com.study.delayLookup;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyt
 * @date 2021年11月21日 15:20
 * 在 SpringFramework 4.3 中引入了一个新的 API ：ObjectProvider ，它可以实现延迟查找。
 * ObjectProvider 相当于延后了 Bean 的获取时机，也延后了异常可能出现的时机，但调用 getObject 方法还是会报异常
 */
public class DelayLookupApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("delaylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        // 下面的代码会报 Bean 没有定义 NoSuchBeanDefinitionException
        // Dog dog = ctx.getBean(Dog.class);

        // 【改进2】：这一行代码不会报错
        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
        // 【问题3】:调用 dogProvider 的 getObject ，真正要取包装里面的 Bean 时，会报异常
        // 【改进3】：ObjectProvider 中还有一个方法：getIfAvailable ，它可以在找不到 Bean 时返回 null 而不抛出异常
//        Dog dog = dogProvider.getIfAvailable();
//        if (dog == null) {
//            dog = new Dog();
//        }

        // 【改进4】：函数式编程可以更加优雅
        Dog dog = dogProvider.getIfAvailable(() -> new Dog());
        // 或者使用方法引用
//        Dog dog = dogProvider.getIfAvailable(Dog::new);
    }
}
