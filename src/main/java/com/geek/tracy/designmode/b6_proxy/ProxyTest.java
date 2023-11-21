package com.geek.tracy.designmode.b6_proxy;

import com.geek.tracy.designmode.b6_proxy.bean.BydCar;
import com.geek.tracy.designmode.b6_proxy.bean.CarProxy;

/**
 * 代理(静态)模式-测试类
 * @Author Tracy
 * @Date 2023/11/21
 */
public class ProxyTest {

    public static void main(String[] args) {
        // 定义代理对象，构造函数入参为被代理对象
        CarProxy proxy = new CarProxy(new BydCar());
        proxy.drive();
    }
}
