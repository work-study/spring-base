package com.java.code.study.spring06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author zouw
 * @date 14:09 2019/1/4
 */
public class TestSpring06 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring06.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        UserService userService = applicationContext.getBean(UserService.class);
        User user = new User();
        user.setAge(12);
        user.setName("zouwei");
        User user1 = new User();
        user1.setAge(13);
        user1.setName("zouwei");
        /*int i = userDao.addUser(user1);
        System.out.println("i:"+i);*/
        //
        userService.bathAddUser(Arrays.asList(user,user1));
        applicationContext.close();
    }
}
