package com.geek.tracy.designmode.b6_adapter.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Tracy
 * @Date 2023/11/7
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, Object> getUserBaseInfo() {
        // 假设获取到的信息如下：
        Map<String, Object> baseInfo = new HashMap<>();
        baseInfo.put("userName", "tony");
        baseInfo.put("mobilePhone", "123");
        return baseInfo;
    }

    @Override
    public Map<String, Object> getUserOfficeInfo() {
        // 用户办公室信息如下：
        Map<String, Object> officeInfo = new HashMap<>();
        officeInfo.put("officeNumber", "999");
        officeInfo.put("officeAddress", "New York");
        officeInfo.put("occupation", "salesperson");
        return officeInfo;
    }

    @Override
    public Map<String, Object> getUserHomeInfo() {
        Map<String, Object> homeInfo = new HashMap<>();
        homeInfo.put("homeNumber", "888");
        homeInfo.put("homeAddress", "888");
        return homeInfo;
    }
}
