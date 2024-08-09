package com.hyc.basic;

/**
 * @author hyc
 * @date 2024/8/3
 * @version: 1.0
 */

class ArraysUtil {
    // 1、循环打印数组
    public static void print(int[] arr) {
        if (arr != null) {
            for (int i : arr) {
                System.out.print(i + ",");
            }
        }
    }

    // 2、循环打印数组，一行打印指定个数的元素
    public static void print(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
            if ((i + 1) % number == 0) {
                System.out.println();
            }
        }
    }

    // 3、将数组转成[元素1,元素2...]这种格式的字符串
    public static String formatPrint(int[] arr) {
        if (arr == null) {
            return "null";
        }
        int iMax = arr.length - 1;
        if (iMax == -1) {
            return "数组长度为0";
        }
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; ; i++) {
            b.append(arr[i]);
            if (i == iMax) {
                return b.append("]").toString();
            }
            b.append(", ");
        }
    }

    // 4、将数组冒泡\或者其他算法排序（直接将原数组排序）
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 5、将数组冒泡\或者其他算法排序（不允许排形参的数组，需要直接返回一个排好序的新数组）
    public static int[] sortNew(int[] arr) {
        int[] arrNew = new int[arr.length];
        System.arraycopy(arr, 0, arrNew , 0, arr.length);
        return sort(arrNew);
    }

    // 6、比较两个数组的所有元素是否完全一致
    public static boolean isEquals(int[] arr1, int[] arr2) {
        if(arr1 == arr2){
            return true;
        }
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    // 7、计算数组的平均值
    public static double avg(int[] arr){
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
    // 8、计算数组的最大值
    public static int max(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
    // 9、计算数组的最小值
    public static int min(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }
    // 10、将数组中的元素反转
    public static int[] reverse(int[] arr){
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[arr.length - 1 - i];
        }
        return arrNew;
    }

    public static boolean isExist(int[]arr, int num){
        for (int i : arr) {
            if(i == num) {
                return true;
            }
        }
        return false;
    }
}