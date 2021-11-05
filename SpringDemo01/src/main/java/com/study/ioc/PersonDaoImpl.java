package com.study.ioc;

public class PersonDaoImpl implements PersonDao{

    @Override
    public void add() {
        System.out.println("add()方法执行了");
    }
}
