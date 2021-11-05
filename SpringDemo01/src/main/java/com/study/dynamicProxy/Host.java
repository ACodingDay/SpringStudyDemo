package com.study.dynamicProxy;

/**
 * 模拟 房东角色
 */
public class Host implements RentOutHouse {

    // 房东出租房子
    @Override
    public void rentOutHouse(){
        System.out.println("房子出租");
    }
}
