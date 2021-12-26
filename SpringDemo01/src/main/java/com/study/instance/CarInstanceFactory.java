package com.study.instance;

import com.study.instance.bean.Car;
import org.springframework.context.annotation.Bean;

/**
 * 实例工厂类
 * @author yyt
 */
public class CarInstanceFactory {

    public CarInstanceFactory() {
        System.out.println("Car 工厂实例化中...");
    }

    // 创建Bean的方法，没有 static 修饰
    public Car createBean() {
        return new Car();
    }

    // 编程式使用实例工厂
    @Bean
    public Car getCar(CarInstanceFactory carInstanceFactory) {
        return carInstanceFactory.createBean();
    }
}
