package com.study.instance;

import com.study.instance.bean.Ball;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;

/**
 * @author yyt
 * @date 2021年12月05日 21:46
 */
public class BallFactoryBean implements FactoryBean<Ball> {

    @Override
    public Ball getObject() throws Exception {
        return new Ball();
    }

    @Bean
    public BallFactoryBean ballFactoryBean() {
        return new BallFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return Ball.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
