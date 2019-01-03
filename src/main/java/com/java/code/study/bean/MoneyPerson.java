package com.java.code.study.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author zouw
 * @date 20:57 2019/1/3
 */

@Data
@ToString
public class MoneyPerson {
    private int age;
    private String name;
    private List<Car> car;
}