package com.yy;

public class People extends Person{
    public static void main(String[] args) {
        String s1 = "张三三";
        String s2 = "李四";
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        char c1 = array1[0];
        char c2 = array2[0];
        int i = c2 - c1;
        System.out.println("i = " + i);
    }
}
