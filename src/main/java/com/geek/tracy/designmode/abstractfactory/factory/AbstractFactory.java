package com.geek.tracy.designmode.abstractfactory.factory;

import com.geek.tracy.designmode.abstractfactory.product.Coffee;
import com.geek.tracy.designmode.abstractfactory.product.Dessert;

/**
 * 抽象工厂，创建各种风味咖啡甜点
 * @Author Tracy
 * @Date 2023/10/16
 */
public interface AbstractFactory {

    /**
     * 做咖啡
     */
    Coffee createCoffee();

    /**
     * 做甜点
     */
    Dessert createDessert();
}
