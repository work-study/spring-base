package com.java.code.study.spring05;

import com.java.code.study.bean.Blue;
import com.java.code.study.bean.Person;

/**
 * @author zouw
 * @date 13:10 2019/1/4
 */
public class MyInstanceFactoryMethod {

    public Person getPerson(String name, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}
