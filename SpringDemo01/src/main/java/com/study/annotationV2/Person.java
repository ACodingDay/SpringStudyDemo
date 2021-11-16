package com.study.annotationV2;

import org.springframework.stereotype.Component;

/**
 * @author yyt
 * @date 2021年11月16日 14:40
 * 在类上标注 @Component 注解，即表示这个类作为一个 Bean 注册到 IOC 容器中
 * 也可以自定义 Bean 的名称，不指定默认就是【类名的首字母小写】
 * 例如，类名 是 Person，那默认名称就是 person
 */
@Component
public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
