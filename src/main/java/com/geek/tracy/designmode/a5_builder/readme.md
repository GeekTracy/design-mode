#一、创建型设计模式:

###5）建造者模式(Builder Pattern)是一种创建型设计模式，通过将对象构造和表示分离，可以使同样的构建过程可以创建不同的表现形式。


> 建造者模式通常包括以下三个必要元素：   
    1、抽象建造者（Abstract Builder)：接口或者抽象类，目的是实现复杂对象有哪些部分需要进行建造，不提供建造细节   
    2、具体建造者（Concrete Builder）：抽象建造者的实现类，将抽象建造者的方法具体化   
    3、产品（Product）：需要生产的东西   
    4、指挥者（Director）：调用具体建造者完成各个部分   


> 实现功能：   
    |--使用建造者模式，实现自行车的构建，制造ofo和美团两种自行车，主要构建车轮和车锁。   
    |--需要的类如下：   
        |-- 1、Bike：   
        |-- 2、Builder：   
        |-- 3、OfoBuilder：   
        |-- 4、MeituanBuilder：   
        |-- 5、Director：指挥者   





