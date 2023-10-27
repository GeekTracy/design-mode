package com.geek.tracy.designmode.builder;

/**
 * @Author Tracy
 * @Date 2023/10/27
 */
public interface Builder {

    /** 造轮子 */
    void createWheel();
    /** 造锁 */
    void createLock();
    /** 组装 */
    Bike install();

}
