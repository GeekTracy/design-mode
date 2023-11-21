package com.geek.tracy.designmode.b6_proxy.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，实现InvocationHandler接口
 * @author Tracy
 * @date 2023/11/21
 */
public class CarHandler implements InvocationHandler {

    /**
     * 被代理对象 成员变量
     */
    private Car car;

    /**
     * 构造函数，入参：代理对象
     */
    public CarHandler(Car car) {
        this.car = car;
    }

    /**
     * 重写InvocationHandler的invoke方法，可用于方法的增强
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入InvocationHandler的重写方法invoke...");
        System.out.println("method " + method.getName() + " 开始执行...");
        // 调用代理对象的
        Object invoke = method.invoke(car, args);
        System.out.println("method " + method.getName() + " 执行结束...");
        return invoke;
    }
}
