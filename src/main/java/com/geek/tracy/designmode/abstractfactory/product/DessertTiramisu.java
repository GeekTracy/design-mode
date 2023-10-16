package com.geek.tracy.designmode.abstractfactory.product;

/**
 * 甜点：提拉米苏
 */
public class DessertTiramisu extends Dessert {

    public DessertTiramisu() {
    }

    @Override
    public void createDessert() {
        // 搭配拿铁咖啡，制作：抹茶慕斯
        System.out.println("suit latte coffee, the tiramisu cake has been made!");
    }
}
