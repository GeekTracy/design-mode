package com.geek.tracy.designmode.b9_decorator;

/**
 * @author Tracy
 * @date 2023/12/12
 */
public class DecoratorTest {

    public static void main(String[] args) {
        // 定义构件
        Component component = new ConcreteComponent();
        component.operation(); // 构件对象直接调用操作方法
        System.out.println("-----------------------------------------");
        // 定义装饰类
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();   // 装饰类调用操作方法，除了原有的操作，还会调用装饰类增加的装饰操作

    }
}
