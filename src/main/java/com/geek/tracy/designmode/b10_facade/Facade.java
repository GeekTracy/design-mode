package com.geek.tracy.designmode.b10_facade;

/**
 *
 * @author Tracy
 * @date 2023/12/13
 */
public class Facade {
    private SubSystem_A subSystem_a = new SubSystem_A();
    private SubSystem_B subSystem_b = new SubSystem_B();
    private SubSystem_C subSystem_c = new SubSystem_C();

    public void method() {
        subSystem_a.query();
        subSystem_b.query();
        subSystem_c.query();
        System.out.println("调用所有子系统查询完毕");
    }
}
