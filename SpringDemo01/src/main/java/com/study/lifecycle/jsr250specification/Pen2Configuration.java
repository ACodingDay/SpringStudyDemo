package com.study.lifecycle.jsr250specification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年12月07日 23:41
 * 演示：@PostConstruct 与 @PreDestroy 注解与 init-method / destroy-method 共存
 */
@Configuration
public class Pen2Configuration {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen2 pen() {
        return new Pen2();
    }
}
