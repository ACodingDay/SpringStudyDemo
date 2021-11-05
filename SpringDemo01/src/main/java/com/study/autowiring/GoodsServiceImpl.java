package com.study.autowiring;

public class GoodsServiceImpl implements GoodsService {

    private GoodsDao goodsDao;

    // setter
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    // 有参构造方法：用于 constructor 装配
    public GoodsServiceImpl(GoodsDao goodsDao) {
        super();
        this.goodsDao = goodsDao;
    }

    @Override
    public void editGoods() {
        goodsDao.addGoods();
        System.out.println("Service层的editGoods()方法执行了...");
    }
}
