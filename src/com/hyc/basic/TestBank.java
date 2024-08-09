package com.hyc.basic;

/**
 *
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

public class TestBank {
    public static void main(String[] args) {
        Account account = new Account();
        account.customer = new Customer();
        account.customer.name = "张三";
        account.customer.id = "3134314321";
        account.customer.address = "北京";
        account.customer.phone = "123456789";

        account.cid= "123456789";

        System.out.println(account.getInfo());



        Double balance = account.save(100);
        System.out.println("存款后余额为："+balance);

        Double balance1 = account.withdraw(50);
        System.out.println("取款后余额为："+balance1);

        Double balance2 = account.getBalance();
        System.out.println("当前余额为："+balance2);

        
    }
}
