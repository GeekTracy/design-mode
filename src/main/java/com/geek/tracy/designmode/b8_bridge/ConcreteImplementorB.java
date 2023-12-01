package com.geek.tracy.designmode.b8_bridge;

/**
 * 具体抽象化角色 实现类B
 * @author Tracy
 * @date 2023/12/1
 */
public class ConcreteImplementorB implements Implementor{
    @Override
    public void character() {
        // 具体抽象化角色B的特点
        System.out.println("concrete Implementor B，is fun!");
    }
}
