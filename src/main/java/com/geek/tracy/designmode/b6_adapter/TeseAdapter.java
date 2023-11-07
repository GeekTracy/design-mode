package com.geek.tracy.designmode.b6_adapter;

import com.geek.tracy.designmode.b6_adapter.bean.IUserInfo;
import com.geek.tracy.designmode.b6_adapter.bean.OuterUserInfo;
import com.geek.tracy.designmode.b6_adapter.bean.UserInfo;

/**
 * @Author Tracy
 * @Date 2023/11/7
 */
public class TeseAdapter {
    public static void main(String[] args) {
        // 获取内部员工信息，常规获取用户信息
        IUserInfo userinfo = new UserInfo();
        System.out.println("-------内部员工信息-----------------------------");
        print(userinfo);

        System.out.println("---------外部员工信息，适配方式无感获取----------------");
        IUserInfo outerUserInfo = new OuterUserInfo();
        print(outerUserInfo);
    }

    /**
     * 无区别打印用户信息
     * @param userinfo
     */
    private static void print(IUserInfo userinfo) {
        System.out.println("user name:" + userinfo.getUserName());
        System.out.println("mobile phone:" + userinfo.getMobilePhone());
        System.out.println("occupation:" + userinfo.getOccupation());
        System.out.println("home telephone:" + userinfo.getHomeTelNumber());
        System.out.println("home address:" + userinfo.getHomeAddress());
        System.out.println("office number:" + userinfo.getOfficeTelNumber());
    }

}
