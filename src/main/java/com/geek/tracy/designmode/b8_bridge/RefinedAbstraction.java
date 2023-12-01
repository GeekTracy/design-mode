package com.geek.tracy.designmode.b8_bridge;

/**
 * 扩展抽象对象 RefinedAbstraction
 * @author Tracy
 * @date 2023/12/1
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operation() {
        // 抽象对象的操作方法，调用实现抽象方法的特征方法
        impl.character();
    }
}
