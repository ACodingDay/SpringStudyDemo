package com.study.bean;

import java.util.*;

/**
 * 演示 setter注入
 */
public class Student {
    // 常量注入
    private String name;
    // bean 注入
    private Address addr;
    // 数组注入
    private String[] books;
    // list注入
    private List<String> hobbies;
    // map注入
    private Map<String, Integer> cards;
    // set注入
    private Set<String> games;
    // null注入
    private String girlFriendName;
    // properties注入
    private Properties info;

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void setGirlFriendName(String girlFriendName) {
        this.girlFriendName = girlFriendName;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setCards(Map<String, Integer> cards) {
        this.cards = cards;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public void show() {
        System.out.println("大家好，我是" + name + "，我住在" + addr.getAddr());
        System.out.println("读过的书有" + Arrays.toString(books));
        System.out.println("爱好有" + Arrays.toString(hobbies.toArray()));
        System.out.println("卡包中有" + cards);
        System.out.println("拥有游戏" + games);
        System.out.println("我的女友名字叫" + girlFriendName);
        System.out.println("更多具体信息" + info);
    }
}
