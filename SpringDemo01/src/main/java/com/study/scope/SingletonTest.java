package com.study.scope;

import com.study.scope.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年12月05日 18:49
 * 使用注解驱动式
 * 演示单例
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        // 两个不同的 Child 持有同一个 Toy
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
}
