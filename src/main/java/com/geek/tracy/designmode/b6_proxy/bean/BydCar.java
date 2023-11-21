package com.geek.tracy.designmode.b6_proxy.bean;

/**
 * 被代理对象：比亚迪汽车
 */
public class BydCar implements Car {

    @Override
    public void drive() {
        System.out.println("比亚迪混动，发车....");
    }
}
