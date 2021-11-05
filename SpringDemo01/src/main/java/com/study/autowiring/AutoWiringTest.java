package com.study.autowiring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringTest {
    @Test
    public void test() {
        // 定义Spring配置文件路径
        String xmlPath = "autowire.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 获得GoodsAction实例
        GoodsAction gAction = (GoodsAction) applicationContext.getBean("goodsAction");
        // 调用GoodsAction中的changeGoods()方法
        gAction.changeGoods();
    }
}
