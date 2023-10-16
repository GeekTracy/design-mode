package com.geek.tracy.designmode.abstractfactory.product;

/**
 * @Author Tracy
 * @Date 2023/10/16
 */
public class CoffeeAmericano extends Coffee {

    public CoffeeAmericano() {
        // 默认：美式
        super("coffee americano");
    }
    public CoffeeAmericano(String name) {
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
