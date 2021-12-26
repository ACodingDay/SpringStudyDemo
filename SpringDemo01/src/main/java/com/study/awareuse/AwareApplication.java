package com.study.awareuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yyt
 * @date 2021年11月21日 16:52
 */
public class AwareApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        // 从容器中取出 AwaredTestBean
        AwaredTestBean abc = ctx.getBean(AwaredTestBean.class);
        // 调用它的 printBeanNames 方法，输出容器中的 bean 名称
        abc.printBeanNames();
        // 成功输出则说明说明 ApplicationContext 已经成功注入到 AwaredTestBean 中了
    }
}
