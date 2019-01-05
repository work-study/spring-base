package com.java.code.study.spring02;

import com.java.code.study.bean.Address;
import com.java.code.study.bean.Person;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestSpring02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring02.xml");
        Person person = applicationContext.getBean("person",Person.class);
        System.out.println("根据名字装配："+person);

        Address address1 = applicationContext.getBean("address1", Address.class);
        System.out.println("bean的继承："+address1);

        Person person1 = applicationContext.getBean("person1",Person.class);
        System.out.println("bean的依赖："+person1);

        DataSource dataSource = applicationContext.getBean("dataSource", ComboPooledDataSource.class);

    }
}
