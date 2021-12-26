package com.study.awareuse;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author yyt
 * @date 2021年11月21日 17:23
 * 如果当前的 bean 需要依赖它本身的 name ，使用 @Autowired 就不好使了，
 * 这个时候就得使用 BeanNameAware 接口来辅助注入当前 bean 的 name 了。
 * BeanNameAware 还有一个可选的搭配接口：NamedBean，
 * 它专门提供了一个 getBeanName 方法，用于获取 bean 的 name 。
 */
public class AwaredTestBean2 implements ApplicationContextAware, BeanNameAware, NamedBean {

    private String beanName;
    private ApplicationContext ctx;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    /**
     * 如果实现 NamedBean 接口，那就不需要自己定义 getName 或者 getBeanName 方法，
     * 直接实现 NamedBean 定义好的 getBeanName 方法即可。
     */
//    public String getName() {
//        return beanName;
//    }

    @Override
    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
