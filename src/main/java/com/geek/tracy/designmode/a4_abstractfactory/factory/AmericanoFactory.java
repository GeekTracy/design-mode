package com.geek.tracy.designmode.a4_abstractfactory.factory;

import com.geek.tracy.designmode.a4_abstractfactory.product.Coffee;
import com.geek.tracy.designmode.a4_abstractfactory.product.CoffeeAmericano;
import com.geek.tracy.designmode.a4_abstractfactory.product.Dessert;
import com.geek.tracy.designmode.a4_abstractfactory.product.DessertTeaMousse;

/**
 * @Author Tracy
 * @Date 2023/10/16
 */
public class AmericanoFactory implements AbstractFactory{

    @Override
    public Coffee createCoffee() {
        return new CoffeeAmericano();
    }

    @Override
    public Dessert createDessert() {
        return new DessertTeaMousse();
    }
}
