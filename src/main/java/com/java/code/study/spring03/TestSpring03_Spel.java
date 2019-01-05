package com.java.code.study.spring03;

import com.java.code.study.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring03_Spel {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        Person person1 = applicationContext.getBean("person1", Person.class);
        System.out.println("person1:" + person1);
        Person person2 = applicationContext.getBean("person2", Person.class);
        System.out.println("person2:" + person2);
    }
}
