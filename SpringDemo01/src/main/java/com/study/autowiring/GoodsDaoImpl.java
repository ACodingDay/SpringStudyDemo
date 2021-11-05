package com.study.autowiring;

public class GoodsDaoImpl implements GoodsDao{
    @Override
    public void addGoods() {
        System.out.println("Dao层的addGoods()方法执行了...");
    }
}
