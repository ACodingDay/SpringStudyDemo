package com.study.annotationV2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyt
 * @date 2021年11月16日 15:02
 * 在配置类中，额外标注一个 @ComponentScan 注解，指定要扫描的路径
 * 也可以在 XML 文件中启用组件扫描
 */
@Configuration
@ComponentScan("com.study.annotationV2")
public class ComponentScanConfiguration {
    /**
     * 不写 @ComponentScan 注解也可以做到组件扫描
     * 使用 AnnotationConfigApplicationContext
     * 声明要扫描的路径，就可以直接扫描到那些标注了 @Component 的 Bean
     */
     ApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.annotationV2");
}
