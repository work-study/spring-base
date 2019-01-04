package com.java.code.study.spring06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zouw
 * @date 14:09 2019/1/4
 */
public class TestSpring06 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring06.xml");

        applicationContext.close();
    }
}
