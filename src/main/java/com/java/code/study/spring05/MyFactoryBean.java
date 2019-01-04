package com.java.code.study.spring05;

import com.java.code.study.bean.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zouw
 * @date 13:17 2019/1/4
 */
public class MyFactoryBean implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        return new Car();
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
