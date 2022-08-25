package com.yy.variable;

/**
 * 变量的定义：
 * 变量是任何程序的基本组成单位，变量通过三个元素组成：类型+名称+值
 */
public class Var01 {
    public static void main(String[] args) {
        int a = 1; // 定义一个变量，类型是int,名称是a，值是3
        int b = 3;
        b = 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c; // 声明一个c变量
        c = 3; // 把3赋值给c.

        float ac = 100000L;
        System.out.println("ac = " + ac);
    }
}
