package com.geek.tracy.designmode.b8_bridge;

/**
 * 抽象化角色 Abstraction (抽象类)
 * @author Tracy
 * @date 2023/12/1
 */
abstract class Abstraction {

    // 实现化角色，作为抽象化角色的成员变量，以组合的形式替代继承来体现Implementor抽象实现类的对象特征
    protected Implementor impl;

    // 构造函数
    protected Abstraction(Implementor impl) {
        this.impl = impl;
    }

    // 抽象化角色的操作方法
    public abstract void operation();
}
