package com.yy.variable;

/**
 * @Description 变量使用细节
 * @Date 2022/8/1 0:28
 */
public class Var03 {
    public static void main(String[] args) {
//        System.out.println(a);  // 变量必须先声明后使用；
        int a = 0;
        System.out.println(a);
        a = 3;
        System.out.println(a);
        a = 30; // 变量的值可以同一类型范围内不断变化
        System.out.println(a);

//        int a = 10; // Variable 'a' is already defined in the scope;变量a已经在这个作用域中定义过了,同一作用域变量不能同名.
    }
}
