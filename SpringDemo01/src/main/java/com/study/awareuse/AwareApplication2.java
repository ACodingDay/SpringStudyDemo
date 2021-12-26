package com.study.awareuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年11月21日 17:49
 */
public class AwareApplication2 {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration2.class);
        AwaredTestBean2 abc = ctx.getBean(AwaredTestBean2.class);
        abc.printBeanNames();
        System.out.println("-----------");
        // 输出 abc 说明 bean 的 name 已经成功注入到 bean 中了。
        System.out.println(abc.getBeanName());
    }
}
