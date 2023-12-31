package com.geek.tracy.designmode.a3_factorymethod;

import com.geek.tracy.designmode.a3_factorymethod.factory.CoffeeAmericanoFactoryMethod;
import com.geek.tracy.designmode.a3_factorymethod.factory.CoffeeFactoryMethod;
import com.geek.tracy.designmode.a3_factorymethod.factory.CoffeeLatteFactoryMethod;
import com.geek.tracy.designmode.a3_factorymethod.product.Coffee;

/**
 * 定义一个具体的业务类：咖啡店，将使用咖啡【工厂方法】卖对应的咖啡
 * @Author Tracy
 * @Date 2023/10/9
 */
public class CoffeeShop {

    /**
     * 咖啡工厂，用来生产对应的产品咖啡
     */
    private CoffeeFactoryMethod factory;

    /**
     * 获取咖啡工厂
     * @return 咖啡工厂
     */
    public CoffeeFactoryMethod getFactory() {
        return factory;
    }

    /**
     * 设置咖啡工厂
     * @param factory 咖啡工厂
     */
    public void setFactory(CoffeeFactoryMethod factory) {
        this.factory = factory;
    }

    /**
     * 制作拿铁
     */
    public Coffee orderLatte() {
        // 设置拿铁工厂
        this.setFactory(new CoffeeLatteFactoryMethod());
        // 在拿铁工厂制作拿铁咖啡
        Coffee coffee = this.getFactory().makeCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * 制作美式
     */
    public Coffee orderAmericano() {
        // 设置美式工厂
        this.setFactory(new CoffeeAmericanoFactoryMethod());
        // 在美式工厂之所美式咖啡
        Coffee coffee = factory.makeCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
