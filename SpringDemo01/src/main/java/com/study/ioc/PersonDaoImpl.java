package com.study.ioc;

/**
 * @author yyt
 */
public class PersonDaoImpl implements PersonDao{

    @Override
    public void add() {
        System.out.println("add()方法执行了");
    }
}
