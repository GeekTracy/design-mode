package com.geek.tracy.designmode.a4_abstractfactory.factory;

import com.geek.tracy.designmode.a4_abstractfactory.product.Coffee;
import com.geek.tracy.designmode.a4_abstractfactory.product.CoffeeLatte;
import com.geek.tracy.designmode.a4_abstractfactory.product.Dessert;
import com.geek.tracy.designmode.a4_abstractfactory.product.DessertTiramisu;

/**
 * @Author Tracy
 * @Date 2023/10/16
 */
public class ItalyFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new CoffeeLatte();
    }

    @Override
    public Dessert createDessert() {
        return new DessertTiramisu();
    }
}
