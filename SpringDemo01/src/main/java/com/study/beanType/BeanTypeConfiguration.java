package com.study.beanType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年12月05日 19:43
 */
@Configuration
@ComponentScan("com.study.beanType")
public class BeanTypeConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }
}
