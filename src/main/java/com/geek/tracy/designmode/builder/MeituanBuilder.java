package com.geek.tracy.designmode.builder;

/**
 * @Author Tracy
 * @Date 2023/10/27
 */
public class MeituanBuilder implements Builder{

    @Override
    public void createWheel() {
        System.out.println("create bike WHEEL by MEITUAN...");
    }

    @Override
    public void createLock() {
        System.out.println("create bike LOCK by MEITUAN...");
    }

    @Override
    public Bike install() {
        return new Bike("MeiTuan", "lock", "1wheel");
    }
}
