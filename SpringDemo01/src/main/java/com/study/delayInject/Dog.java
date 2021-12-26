package com.study.delayInject;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yyt
 * @date 2021年11月21日 19:21
 * Setter 注入时，直接在 setter 中标注 @Autowired ，并注入对应的 bean 即可。
 * 如果使用延迟注入，则注入的就应该换成 ObjectProvider
 */
@Component
public class Dog {

    private Person person;

    /**
     * 构造器的延迟注入。效果跟 setter 是一样的，
     * 只不过 setter 的注入时机是创建对象后，而构造器的注入时机是创建对象时。
     */
    @Autowired
    public Dog(ObjectProvider<Person> person) {
        // 如果没有Bean，则采用缺省策略创建
        this.person = person.getIfAvailable(Person::new);
    }

    /**
     * setter 的延迟注入
     */
    @Autowired
    public void setPerson(ObjectProvider<Person> person) {
        // 有 Bean 才取出，注入
        this.person = person.getIfAvailable();
    }

    /**
     * 属性直接注入是不能直接注入 Bean 的，只能注入 ObjectProvider，
     * 通常也不会这么干，因为这样注入了之后，每次要用这个 Bean 的时候都得判断一次
     */
    @Autowired
    private ObjectProvider<Person> person2;

    @Override
    public String toString() {
        // 每用一次都要 getIfAvailable 一次
        return "Dog{" + "person=" + person2.getIfAvailable(Person::new) + '}';
    }
}