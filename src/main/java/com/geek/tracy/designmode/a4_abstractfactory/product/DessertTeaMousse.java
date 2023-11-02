package com.geek.tracy.designmode.a4_abstractfactory.product;

/**
 * 甜点：抹茶慕斯
 */
public class DessertTeaMousse extends Dessert{

    public DessertTeaMousse() {
    }

    @Override
    public void createDessert() {
        // 搭配美式咖啡，制作：抹茶慕斯
        System.out.println("suit americano coffee, the tea mousse cake has been made!");
    }
}
