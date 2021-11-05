package com.study.autowiring;

public class GoodsAction {
    private GoodsService goodsService;

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    public void changeGoods() {
        // 调用GoodsService中的editGoods()方法
        goodsService.editGoods();
        System.out.println("Action层的changeGoods()方法执行了...");
    }
}
