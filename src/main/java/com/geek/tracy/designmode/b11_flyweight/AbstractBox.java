package com.geek.tracy.designmode.b11_flyweight;

/**
 * 享元抽象类：方块
 * @author Tracy
 * @date 2023/12/15
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + "，颜色：" + color);
    }
}
