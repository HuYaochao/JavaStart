package com.jdbc.druid;

import java.util.Scanner;

/**
 *
 * @author hyc
 * @date 2024/8/13
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println("请输入要更改密码的用户名称");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("请输入要更改的密码");
        String newPassword = sc.next();

        boolean a =userService.updateUserPassword(name,newPassword);
        System.out.println(a);
        }
    }



//        boolean isLoggedIn = userService.login("zs", "123");
//
//        if (isLoggedIn) {
//            System.out.println("Login successful!");
//        } else {
//            System.out.println("Login failed!");
//        }
//
//        System.out.println("--------------");


//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String username = sc.nextLine();
//        System.out.println("请输入密码：");
//        String password = sc.nextLine();
//        boolean a=userService.addUser(username, password);
//
//        System.out.println("添加用户成功"+a);

//UserService userService = new UserService();
//        System.out.println("请输入要删除的用户名称");
//String name = new Scanner(System.in).nextLine();
//boolean a=userService.deleteUser(name);
//        System.out.println(a);