package com.geek.tracy.designmode.b6_proxy;

import com.geek.tracy.designmode.b6_proxy.bean.BydCar;
import com.geek.tracy.designmode.b6_proxy.bean.Car;
import com.geek.tracy.designmode.b6_proxy.bean.CarHandler;
import com.geek.tracy.designmode.b6_proxy.bean.CarProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 代理模式-测试类
 *
 * @Author Tracy
 * @Date 2023/11/21
 */
public class ProxyTest {

    /**
     * 静态代理--测试
     */
    @Test
    public void proxytest() {
        // 定义代理对象，构造函数入参为被代理对象
        CarProxy proxy = new CarProxy(new BydCar());
        proxy.drive();
    }

    /**
     * 动态代理--测试
     */
    @Test
    public void dynamicProxyTest() {
        // JDK的动态代理类生成的class文件保存到本地
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 动态创建代理类，
        Car carProxy = (Car) Proxy.newProxyInstance(Car.class.getClassLoader(),
                new Class[]{Car.class},
                new CarHandler(new BydCar())
        );
        carProxy.drive();
    }
}
