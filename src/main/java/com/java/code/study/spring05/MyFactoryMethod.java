package com.java.code.study.spring05;

import com.java.code.study.bean.Blue;

/**
 * @author zouw
 * @date 11:34 2019/1/4
 */
public class MyFactoryMethod {
    public static Blue getBlue(String name,Integer age) {
        Blue blue = new Blue();
        blue.setName(name);
        blue.setAge(age);
        return blue;
    }
}
