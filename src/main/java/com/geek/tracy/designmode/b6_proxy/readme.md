#二、结构型设计模式:

###6）代理（静态）模式(Proxy Pattern)
> 代理模式是一种结构型设计模式，它允许通过使用代理对象来控制对另一个对象的访问。代理对象通常会拦截被代理对象的访问，并在其间插入额外的逻辑功能或控制。



静态代理类结构和设计场景：
> 静态代理的实现，由抽象接口、被代理对象、代理对象三部分实现，被代理对象和代理对象分别实现了抽象接口的实现方法。代理对象实现构造方法，入参传入具体
被代理对象。客户端调用的时候通过创建代理对象，并传入具体的代理对象来获取具体对象的功能方法实现。

------------------------------------------------------------------------------------------------------------------------
相比于静态代理，动态代理的优势在于
> 1）可以很方便的对代理类的方法进行统一处理。
> 2）不用为每一个目标类(需要增强的类)单独编写代理类。

### 拓展1：动态代理
> 动态代理的实现，由抽象对象、被代理对象、动态代理类InvocationHandler三部分实现，被代理对象实现抽象接口的实现方法。代理对象实现了构造方法，入参
传入具体的被代理对象，且实现了InvocationHandler的invoke方法，客户端调用的时候通过创建代理对象，并传入具体的被代理对象来获取具体对象的功能方法
实现。

###动态代理
> 先定义了接口Hello，但是并不去编写实现类，而是直接通过JDK提供的一个Proxy.newProxyInstance()创建了一个
Hello接口对象。这种没有实现类但是在运行期动态创建了一个接口对象的方式，称为动态代码。JDK提供的动态创建接口对象的方式，就叫动态代理。

```java
例如：
// 定义接口
interface Hello {
    void morning(String name);
}

// 通过Proxy.newProxyInstance()创建一个hello接口，没有实现类
     // 参数：
     // loader: 类加载器
     // interfaces:动态代理类需要实现的接口
     // h:动态代理方法在执行时，会调用h里面的invoke方法去执行。
// newProxyInstance (ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {}

Hello hello = (Hello) Proxy.newProxyInstance(
        Hello.class,
        new Class[]{Hello.class},
        new InvocationHandler() { // InvocationHanlder 匿名内部类
            // proxy：代理对象， method：代理的方法对象，args：方法调用时参数
            public Object invoke(Object Proxy, Method method, Object[] args) throws Throwable {
                before(); // 调用方法前的增强
                // 具体处理逻辑
                after();  // 调用方法后的增强
            }
    }
);
hello.morning("hello world");
```



###拓展2：CGLIB(Code Generation Library)代理 
> 基于目标类生成该类的一个子类作为代理类，目标类必须可以继承。与动态代理区别：CGLIB相比于JDK动态代理更加强大，JDK动态代理只能对接口进行代理，而CGLIB既可以代理普通类，也能够代理接口。

```text
实现步骤：
    1）创建Enhancer实例；
    2）通过setSuperclass方法来设置目标类；
    3）通过setCallback方法来设置拦截对象；
    4）create方法生成Target的代理类，并返回代理类的实例；

```



