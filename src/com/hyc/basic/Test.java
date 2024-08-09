package com.hyc.basic;

/**
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        System.out.println("com.hyc.basic.ArraysUtil.print(arr)");
        ArraysUtil.print(arr);
        System.out.println();

        System.out.println("com.hyc.basic.ArraysUtil.print(arr,2)");
        ArraysUtil.print(arr, 2);
        System.out.println();

        System.out.println("com.hyc.basic.ArraysUtil.formatPrint(arr)");
        String result = ArraysUtil.formatPrint(arr);
        System.out.println(result);
        System.out.println();

        System.out.println("com.hyc.basic.ArraysUtil.sort(arr)");
        int[] arr1=ArraysUtil.sort(arr);
        System.out.println(ArraysUtil.formatPrint(arr1));


        System.out.println("com.hyc.basic.ArraysUtil.sortNew(arr)");
        System.out.println();
        int[] arr2 = ArraysUtil.sortNew(arr);
        System.out.println(ArraysUtil.formatPrint(arr2));

        System.out.println();
        boolean flag = ArraysUtil.isEquals(arr1, arr2);
        System.out.println("com.hyc.basic.ArraysUtil.isEquals(arr1, arr2) = " + flag);

        System.out.println();
        double result1 = ArraysUtil.avg(arr);
        System.out.println("com.hyc.basic.ArraysUtil.avg(arr) = " + result1);

        System.out.println();
        int max = ArraysUtil.max(arr);
        System.out.println("com.hyc.basic.ArraysUtil.max(arr) = " + max);

        System.out.println();
        int min = ArraysUtil.min(arr);
        System.out.println("com.hyc.basic.ArraysUtil.min(arr) = " + min);

        System.out.println();
        int[] arr3 = ArraysUtil.reverse(arr);
        System.out.println(ArraysUtil.formatPrint(arr3));

        System.out.println();
        boolean flag1 = ArraysUtil.isExist(arr, 7);
        System.out.println("com.hyc.basic.ArraysUtil.isExist(arr, 7) = " + flag1);
    }
}
