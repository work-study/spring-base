package com.java.code.study.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author zouw
 * @date 11:01 2019/1/4
 */
@ToString
public class Blue {
    private String name;
    private Integer age;

    public Blue() {
        System.out.println("construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge");
        this.age = age;
    }

    public void init() {
        System.out.println("init()");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
