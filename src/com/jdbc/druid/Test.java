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
        System.out.println("������Ҫ����������û�����");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("������Ҫ���ĵ�����");
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
//        System.out.println("�������û�����");
//        String username = sc.nextLine();
//        System.out.println("���������룺");
//        String password = sc.nextLine();
//        boolean a=userService.addUser(username, password);
//
//        System.out.println("����û��ɹ�"+a);

//UserService userService = new UserService();
//        System.out.println("������Ҫɾ�����û�����");
//String name = new Scanner(System.in).nextLine();
//boolean a=userService.deleteUser(name);
//        System.out.println(a);