package com.hyc.basic;

/**
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

public class Account {
    String cid;
    Double balance=0.0;
    Customer customer;

    public String getInfo() {
        return customer.getInfo()+"\n"+"卡号"+cid;
    }

    public Double getBalance() {
        return balance;
    }

    public Double withdraw(double money) {
        if (money > balance) {
            System.out.println("余额不足");
            return -1.0;
        } else {
            balance -= money;
            return money;
        }
    }

    public Double save(double money) {
        balance += money;
        return money;
    }

}
