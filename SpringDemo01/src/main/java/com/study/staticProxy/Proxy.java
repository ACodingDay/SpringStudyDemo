package com.study.staticProxy;

/**
 * 模拟 中介角色
 */
public class Proxy implements RentOutHouse{
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rentOutHouse(){
        chooseHouse();
        // 出租房东的房子
        host.rentOutHouse();
        getBrokerageFee();
    }

    // 物色房子
    private void chooseHouse(){
        System.out.println("中介带顾客去挑选出租屋");
    }

    // 事成之后收中介费
    private void getBrokerageFee(){
        System.out.println("中介收取中介费");
    }
}
