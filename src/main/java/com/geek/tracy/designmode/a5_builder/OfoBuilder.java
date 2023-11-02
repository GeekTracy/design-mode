package com.geek.tracy.designmode.a5_builder;

/**
 * @Author Tracy
 * @Date 2023/10/27
 */
public class OfoBuilder implements Builder {
    @Override
    public void createWheel() {
        System.out.println("create bike WHEEL by ofo...");
    }

    @Override
    public void createLock() {
        System.out.println("create bike LOCK by ofo...");
    }

    @Override
    public Bike install() {
        System.out.println("install bike by ofo...");
        return new Bike("OFO", "Lock", "2wheel");
    }
}
