package com.geek.tracy.designmode.abstractfactory.product;

/**
 * @Author Tracy
 * @Date 2023/10/16
 */
public class CoffeeLatte extends Coffee {

    public CoffeeLatte() {
        // 默认：美式
        super("coffee latte");
    }
    public CoffeeLatte(String name) {
        super(name);
    }

    @Override
    public void addMilk() {
        System.out.println(super.getName() + " add milk");
    }

    @Override
    public void addSugar() {
        System.out.println(super.getName() + " add sugar");

    }
}
