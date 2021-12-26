package com.study.lifecycle.initmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年12月07日 21:20
 * 使用注解，配置初始化方法与注销方法
 */
@Configuration
public class LifeCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("旺财");
        return dog;
    }
}
