package com.java.code.study.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author zouw
 * @date 20:46 2019/1/3
 */
@Data
@ToString
public class Person {
    private int age;
    private String name;
    private Car car;
}
