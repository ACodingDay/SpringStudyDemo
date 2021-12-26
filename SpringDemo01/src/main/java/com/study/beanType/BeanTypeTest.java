package com.study.beanType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年12月05日 20:17
 */
public class BeanTypeTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        Toy toy = ctx.getBean(Toy.class);
        System.out.println(toy);
    }
}
