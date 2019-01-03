package com.java.code.study.spring01;

import com.java.code.study.bean.Car;
import com.java.code.study.bean.MoneyPerson;
import com.java.code.study.bean.Person;
import com.java.code.study.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zouw
 * @date 20:21 2019/1/3
 */
public class TestSpring01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld);

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car);

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        MoneyPerson moneyPerson = applicationContext.getBean(MoneyPerson.class);
        System.out.println(moneyPerson);
    }
}
