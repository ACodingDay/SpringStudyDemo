package com.study.delayLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyt
 * @date 2021年11月21日 15:11
 * xml 中只注册 Cat ，这样 IOC 容器中就只有 Cat ，没有 Dog
 * ApplicationContext 中有一个方法就可以专门用来检查容器中是否有指定的 Bean ：containsBean
 */
public class ImmediatlyLookupApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("delaylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

//        Dog dog;
//        try {
//            // 由于 Dog 没有在 IOC 容器中，所以调用 getBean 方法时会报 NoSuchBeanDefinitionException
//            dog = ctx.getBean(Dog.class);
//        } catch (NoSuchBeanDefinitionException e) {
//            // 找不到 Dog 时再手动创建
//            // 【问题1】：性能不好，编码麻烦
//            dog = new Dog();
//        }

        /**
         * 【改进1】：使用 containsBean() 方法
         * 【问题2】：这个 containsBean 方法只能传 bean 的 id ，不能查类型，
         * 如果 Bean 的名不叫 dog，就没用了
         */
        Dog dog = ctx.containsBean("dog") ? (Dog) ctx.getBean("dog") : new Dog();
        System.out.println(dog);
    }

}
