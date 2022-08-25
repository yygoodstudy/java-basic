package com.yy.variable;

/**
 * @Description java自动数据类型转换
 * @Date 2022/8/2 1:08
 */
public class AutoConvert {
    public static void main(String[] args) {
        int a = 'a'; // 低精度的字符类型转为高精度的int
        double d = 100; // 低精度的int类型自动转为高精度类型的double

        System.out.println("a = " + a);
        System.out.println("d = " + d);
    }
}
