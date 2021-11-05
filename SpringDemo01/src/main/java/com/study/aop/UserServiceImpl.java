package com.study.aop;

/**
 * 使用 AOP可以使得业务变得更加纯粹
 * 不需要考虑其他拓展业务
 */
public class UserServiceImpl implements UserServices{
    @Override
    public void add() {
        System.out.println("新增用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void delete() {
        System.out.println("注销用户");
    }

    @Override
    public void search() {
        System.out.println("搜索用户");
    }
}
