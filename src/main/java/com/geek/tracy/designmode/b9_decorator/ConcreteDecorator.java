package com.geek.tracy.designmode.b9_decorator;

/**
 * @author Tracy
 * @date 2023/12/12
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();    // 调用原有类的业务方法
        decorationFunction(); // 具体装饰类增加的装饰方法
    }

    // 具体装饰类增加的装饰方法
    private void decorationFunction() {
        System.out.println("具体装饰类增加的装饰方法");
    }
}
