package com.study.scope;

import com.study.scope.bean.Child;
import com.study.scope.bean.Toy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年12月05日 18:46
 */
@Configuration
@ComponentScan("com.study.scope.bean")
public class BeanScopeConfiguration {

    @Bean
    public Child child1(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }
}
