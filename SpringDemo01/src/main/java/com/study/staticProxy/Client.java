package com.study.staticProxy;

/**
 * 模拟 租房子的客户角色
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rentOutHouse();
    }
}
