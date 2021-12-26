package com.study.beanType;

import org.springframework.stereotype.Component;

/**
 * @author yyt
 * @date 2021年12月05日 19:16
 */
@Component
public class Child {
    // 当前的小孩子想玩球
    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }
}
