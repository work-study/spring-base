package com.java.code.study.spring05;

import com.java.code.study.bean.Blue;
import com.java.code.study.bean.Car;
import com.java.code.study.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zouw
 * @date 11:23 2019/1/4
 */
public class TestSpring05 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring05.xml");
        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println(blue);

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        Car car = (Car) applicationContext.getBean("myFactoryBean");
        System.out.println(car);
    }
}
