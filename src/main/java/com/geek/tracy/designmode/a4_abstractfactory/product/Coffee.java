package com.geek.tracy.designmode.a4_abstractfactory.product;

/**
 * 产品抽象类：咖啡
 */
public abstract class Coffee {

    private String name;

    /** 加奶 */
    public abstract void addMilk();

    /** 加糖 */
    public abstract void addSugar();

    public Coffee() {
    }

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
