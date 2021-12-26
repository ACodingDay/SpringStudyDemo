package com.study.awareuse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年11月21日 16:52
 * 编写一个配置类，创建这个 AwaredTestBean
 */
@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean abc() {
        return new AwaredTestBean();
    }
}
