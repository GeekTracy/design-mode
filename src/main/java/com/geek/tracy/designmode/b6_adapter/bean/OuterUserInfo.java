package com.geek.tracy.designmode.b6_adapter.bean;

import java.util.Map;

/**
 *
 *
 * @Author Tracy
 * @Date 2023/11/7
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<String, Object> baseInfo = super.getUserBaseInfo();
    private Map<String, Object> officeInfo = super.getUserOfficeInfo();
    private Map<String, Object> homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        // 包装生成与内部员工：UserInfo相同的对外方法，以下相同方式处理
        return (String) this.baseInfo.get("userName");
    }

    @Override
    public String getMobilePhone() {
        return (String) this.baseInfo.get("mobilePhone");
    }

    @Override
    public String getHomeAddress() {
        return (String) this.homeInfo.get("homeNumber");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) this.homeInfo.get("homeNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) this.officeInfo.get("officeNumber");
    }

    @Override
    public String getOccupation() {
        return (String) this.officeInfo.get("occupation");
    }
}
