package com.study.ioc;

/**
 * 演示 属性setter注入
 */
public class PersonServiceImpl implements PersonService {
    // 原写法，这种写法固定了某个对象，依赖性很大，一旦想要替换，代价很大
    // private PersonDao personDao = new PersonDaoImpl();

    // 定义接口声明
    private PersonDao personDao;

    // 提供setter()方法，用于依赖注入，降低了耦合度
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    // 实现 PersonService接口的方法
    @Override
    public void addPerson() {
        // 调用PersonDao中的add()方法
        personDao.add();
        System.out.println("addPerson()执行了...");
    }
}
