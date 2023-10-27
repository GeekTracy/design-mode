package com.geek.tracy.designmode.builder;

/**
 * @Author Tracy
 * @Date 2023/10/27
 */
public class Director {

    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 生产产品
     */
    public Bike construct() {
        builder.createWheel();
        builder.createLock();
        return builder.install();
    }
}
