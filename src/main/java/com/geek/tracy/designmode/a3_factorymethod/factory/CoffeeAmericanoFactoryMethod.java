package com.geek.tracy.designmode.a3_factorymethod.factory;

import com.geek.tracy.designmode.a3_factorymethod.product.Coffee;
import com.geek.tracy.designmode.a3_factorymethod.product.CoffeeLatte;

/**
 * 拿铁 工厂方法，生产拿铁咖啡
 * @Author Tracy
 * @Date 2023/10/9
 */
public class CoffeeAmericanoFactoryMethod implements CoffeeFactoryMethod {
    @Override
    public Coffee makeCoffee() {
        return new CoffeeLatte("coffee americano");
    }
}
