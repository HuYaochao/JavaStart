package com.hyc.exception;

/**
 *
 * @author hyc
 * @date 2024/8/9
 * @version: 1.0
 */

public class Simple03 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
            System.out.println("b=" + b);
        } catch (ArithmeticException e) {
            System.out.println("除0异常：" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组超越边界异常：" + e);
        }
        catch (Exception e) {
            System.out.println("未知异常：" + e);
        }


    }
}
