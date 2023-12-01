package com.geek.tracy.designmode.b8_bridge;

/**
 * @author Tracy
 * @date 2023/12/1
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 定义抽象化对象 1
        Abstraction refinedAbstraction1 = new RefinedAbstraction(new ConcreteImplementorA());
        // 调用抽象化对象的操作方法
        refinedAbstraction1.operation();

        // 定义抽象化对象 2
        Abstraction refinedAbstraction2 = new RefinedAbstraction(new ConcreteImplementorB());
        // 调用抽象化对象的操作方法
        refinedAbstraction2.operation();
    }
}
