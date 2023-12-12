package com.geek.tracy.designmode.b9_decorator;

/**
 * 抽象装饰类，集成抽象构件角色
 * @author Tracy
 * @date 2023/12/12
 */
public abstract class Decorator extends Component {

    // 定义组件角色属性
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
