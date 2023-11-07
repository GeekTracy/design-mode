package com.geek.tracy.designmode.b6_adapter.bean;

/**
 * @Author Tracy
 * @Date 2023/11/7
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        return "jack";
    }

    @Override
    public String getHomeAddress() {
        return "Los Angeles";
    }

    @Override
    public String getMobilePhone() {
        return "119";
    }

    @Override
    public String getOfficeTelNumber() {
        return "911";
    }

    @Override
    public String getOccupation() {
        return "manager";
    }

    @Override
    public String getHomeTelNumber() {
        return "010110";
    }
}
