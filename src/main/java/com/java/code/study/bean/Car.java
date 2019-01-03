package com.java.code.study.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author zouw
 * @date 20:24 2019/1/3
 */
@Data
@ToString
public class Car{
    private String name;
    private String brand;
    private int price;

    public Car() {
    }

    public Car(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}
