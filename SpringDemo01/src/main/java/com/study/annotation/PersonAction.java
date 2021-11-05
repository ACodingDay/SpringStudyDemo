package com.study.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * 创建 Action
 */
@Controller("personAction")
public class PersonAction {
    @Resource(name = "personService2")
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void add() {
        // 调用personService中的add()方法
        personService.add();
        System.out.println("Action层的add()方法执行了...");
    }
}
