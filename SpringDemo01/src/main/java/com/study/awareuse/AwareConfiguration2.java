package com.study.awareuse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年11月21日 17:50
 */
@Configuration
public class AwareConfiguration2 {

    @Bean
    public AwaredTestBean2 abc() {
        return new AwaredTestBean2();
    }
}
