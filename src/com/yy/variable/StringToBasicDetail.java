package com.yy.variable;

/**
 * @Description String转基本数据类型，程序遇到异常就会终止
 * @Date 2022/8/9 16:57
 */
public class StringToBasicDetail {
    public static void main(String[] args) {
        String str1 = "123";
        int number = Integer.parseInt(str1);
        System.out.println("number = " + number);

        String str2 = "12s3";
        int number2 = Integer.parseInt(str2);
        System.out.println("number2 = " + number2); // NumberFormatException

        String str3 = String.valueOf(123);
        System.out.println("str3 = " + str3);
    }
}
