package com.geek.tracy.designmode.a5_builder;

/**
 * 生产的产品：自行车
 * @Author Tracy
 * @Date 2023/10/27
 */
public class Bike {

    private String name;

    private String lock;

    private String wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public Bike(String name, String lock, String wheel) {
        this.name = name;
        this.lock = lock;
        this.wheel = wheel;
    }
}
