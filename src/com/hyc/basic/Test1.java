package com.hyc.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {85, 63, 49, 22, 10, 0};  // 数组最后一个元素未赋值
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要插入的元素：");
        int newElement = scanner.nextInt();

        // 关闭扫描器
        scanner.close();

        System.out.println("插入前的数组：");
        System.out.println(Arrays.toString(arr));

        // 找到插入位置并移动元素
        int i;
        for (i = arr.length - 2; i >= 0; i--) {
            if (newElement > arr[i]) {
                arr[i + 1] = arr[i];
            } else {
                break;
            }
        }
        arr[i + 1] = newElement;

        System.out.println("插入后的数组：");
        System.out.println(Arrays.toString(arr));
    }
}
