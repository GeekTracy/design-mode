package com.geek.tracy.designmode.a5_builder;

/**
 * @Author Tracy
 * @Date 2023/10/27
 */
public class BuilderTest {
    public static void main(String[] args) {
        // ## 通过Director指挥者类的construct方法制造产品
        // 造ofo
        Director ofoDirector = new Director(new OfoBuilder());
        Bike OfoBike = ofoDirector.construct();
        // 造美团自行车
        Director meituanDerector = new Director(new MeituanBuilder());
        Bike meituanBike = meituanDerector.construct();
    }
}
