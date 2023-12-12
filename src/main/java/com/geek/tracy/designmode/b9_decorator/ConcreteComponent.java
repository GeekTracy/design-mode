package com.geek.tracy.designmode.b9_decorator;

/**
 * 具体构件实现类
 * @author Tracy
 * @date 2023/12/12
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体构件角色:执行操作方法");
    }
}
