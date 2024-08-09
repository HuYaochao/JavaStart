package com.hyc.exception;
/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

public class Simple01 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        test2();
    }

    private static  void test2(){
        test3();
    }
    private static  void test3(){
        int i = 1/0;
        System.out.println(i);
    }
}
