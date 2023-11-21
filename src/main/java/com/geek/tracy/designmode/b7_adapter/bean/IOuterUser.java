package com.geek.tracy.designmode.b7_adapter.bean;

import java.util.Map;

/**
 * 外部员工
 */
public interface IOuterUser {

    // 外部员工，与内部员工信息获取方式不同，这里通过其单独的方式获取用户基础信息
    Map<String, Object> getUserBaseInfo();

    // 用户工作单位信息
    Map<String, Object> getUserOfficeInfo();

    // 用户的家庭信息
    Map<String, Object> getUserHomeInfo();

}
