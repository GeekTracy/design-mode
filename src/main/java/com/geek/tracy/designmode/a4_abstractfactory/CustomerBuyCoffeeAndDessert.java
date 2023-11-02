package com.geek.tracy.designmode.a4_abstractfactory;

import com.geek.tracy.designmode.a4_abstractfactory.factory.AbstractFactory;
import com.geek.tracy.designmode.a4_abstractfactory.factory.AmericanoFactory;
import com.geek.tracy.designmode.a4_abstractfactory.factory.ItalyFactory;
import com.geek.tracy.designmode.a4_abstractfactory.product.Coffee;
import com.geek.tracy.designmode.a4_abstractfactory.product.Dessert;

/**
 * @Author Tracy
 * @Date 2023/10/16
 */
public class CustomerBuyCoffeeAndDessert {
    public static void main(String[] args) {
        // 进入咖啡店
        System.out.println("entry coffee shop...");
        //
        System.out.println("小红下单买了份：拿铁+提拉米苏");
        AbstractFactory italyFactory = new ItalyFactory();
        Coffee latteCoffee = italyFactory.createCoffee();
        latteCoffee.addSugar();
        latteCoffee.addMilk();
        Dessert tiramisuDessert = italyFactory.createDessert();
        tiramisuDessert.createDessert();

        System.out.println("小华下单买了份：美式+抹茶慕斯");
        AbstractFactory americanoFactory = new AmericanoFactory();
        Coffee americanoCoffee = americanoFactory.createCoffee();
        americanoCoffee.addMilk();
        americanoCoffee.addSugar();
        Dessert teaMousse = americanoFactory.createDessert();
        teaMousse.createDessert();

    }
}
