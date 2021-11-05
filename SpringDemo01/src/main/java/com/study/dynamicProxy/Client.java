package com.study.dynamicProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟 租房子的客户角色
 */
public class Client {

    public static void main(String[] args) {
//        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        // 设置被代理类 host
//        pih.setTarget(host);
//        // 生成代理类 proxy
//        RentOutHouse proxy = (RentOutHouse) pih.getProxy();
//        proxy.rentOutHouse();

        // 代理 List类
        pih.setTarget(new ArrayList<String>());
        List<String> list = (List<String>) pih.getProxy();
        list.add("2021年6月9日 00:57:54");
        list.add("下标1：第二个内容");
        System.out.println(list.get(1));
    }
}
