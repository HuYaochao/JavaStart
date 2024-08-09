package com.hyc.basic;

/**
 *
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

public class Customer {
    String name;
    String id;
    String phone;
    String address;

    public String getInfo(){
        return "姓名：" + name + "\n身份证号：" + id + "\n电话：" + phone + "\n地址：" + address;

    }

}
