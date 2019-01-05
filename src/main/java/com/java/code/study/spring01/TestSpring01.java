package com.java.code.study.spring01;

import com.java.code.study.bean.*;
import com.java.code.study.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zouw
 * @date 20:21 2019/1/3
 */
public class TestSpring01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld);

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car);

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        MoneyPerson moneyPerson = applicationContext.getBean("moneyPerson",MoneyPerson.class);
        System.out.println(moneyPerson);

        NewPerson newPerson = applicationContext.getBean(NewPerson.class);
        System.out.println(newPerson);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);

        MoneyPerson moneyPerson1 = applicationContext.getBean("moneyPerson1",MoneyPerson.class);
        System.out.println(moneyPerson1);

        MoneyPerson moneyPerson2 = applicationContext.getBean("moneyPerson2",MoneyPerson.class);
        System.out.println(moneyPerson2);
    }
}
