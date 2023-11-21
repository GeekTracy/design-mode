package com.geek.tracy.designmode.b6_proxy.bean;

/**
 * 代理对象
 */
public class CarProxy implements Car{

    /**
     * 被代理对象 成员变量
     */
    private Car car;

    /**
     * 构造函数，入参：代理对象
     */
    public CarProxy(Car car) {
        this.car = car;
    }

    /**
     * 代理对象，通过成员变量（被代理对象）调用方法
     */
    @Override
    public void drive() {
        System.out.println("静态代理，执行前增强");
        car.drive();
        System.out.println("静态代理，执行后增强");
    }
}
