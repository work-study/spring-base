package com.java.code.study.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @author zouw
 * @date 21:03 2019/1/3
 */
@Data
@ToString
public class NewPerson {
    private int age;
    private String name;
    private Map<String,Car> car;
}
