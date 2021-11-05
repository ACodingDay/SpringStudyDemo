package com.study.autowiring;

public class GoodsDaoImpl2 implements GoodsDao{
    @Override
    public void addGoods() {
        System.out.println("另一个Dao层接口的实现方法");
    }
}
