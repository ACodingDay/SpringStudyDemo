package com.study.instance;

import com.study.instance.bean.People;
import org.springframework.context.annotation.Bean;

/**
 * 静态工厂
 * @author yyt
 * @date 2021/12/6 0:40
 */
public class PeopleStaticFactory {

    // 创建 Bean 实例的静态工厂方法
    public static People createBean() {
        return new People();
    }

    // 编程式使用静态工厂
    @Bean
    public People getPeople() {
        return PeopleStaticFactory.createBean();
    }
}
