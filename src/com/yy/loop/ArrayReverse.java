package com.yy.loop;

/**
 * @Description 数组反转
 * @Date 2022/8/9 17:48
 */
public class ArrayReverse {
    public static void main(String[] args) {
        reverse1();
    }

    public static void reverse1(){
        String[] arr1 = {"a", "b", "c", "d", "e","f","g"};
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
            System.out.println(arr2[i]);
        }
    }
}
