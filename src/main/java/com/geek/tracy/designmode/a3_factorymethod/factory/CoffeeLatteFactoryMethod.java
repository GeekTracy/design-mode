package com.geek.tracy.designmode.a3_factorymethod.factory;

import com.geek.tracy.designmode.a3_factorymethod.product.CoffeeLatte;
import com.geek.tracy.designmode.a3_factorymethod.product.Coffee;

/**
 * 拿铁 工厂方法，生产拿铁咖啡
 * @Author Tracy
 * @Date 2023/10/9
 */
public class CoffeeLatteFactoryMethod implements CoffeeFactoryMethod {
    @Override
    public Coffee makeCoffee() {
        return new CoffeeLatte("coffee latte");
    }
}
