package com.study.lifecycle.allin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年12月08日 20:55
 * 使用注解配置 Pen4 的生存周期方法
 */
@Configuration
public class Pen4Configuration {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen4 pen() {
        return new Pen4();
    }
}
