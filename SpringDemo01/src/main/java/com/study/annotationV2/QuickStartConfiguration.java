package com.study.annotationV2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年11月16日 14:38
 * 一个配置类就类似于一个 XML 文件
 */
@Configuration
public class QuickStartConfiguration {

    /**
     * @Bean 注解相当于 XML 文件中使用 <bean> 标签配置
     * 方法名默认就是 Bean 的 id
     * 也可以在括号中自定义，例如我这里定义其 id 为 p1
     */
    @Bean(name = "p1")
    public Person person(){
        Person person = new Person();
        // 相当于 XML 文件中使用 <property> 标签设置属性
        person.setName("靓仔");
        person.setAge(18);
        return person;
    }
}
