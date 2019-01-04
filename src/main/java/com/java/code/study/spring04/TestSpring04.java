package com.java.code.study.spring04;

import com.java.code.study.bean.Blue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zouw
 * @date 11:01 2019/1/4
 */
public class TestSpring04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring04.xml");
        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println(blue);
        applicationContext.close();
    }
}
