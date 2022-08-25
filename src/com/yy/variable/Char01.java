package com.yy.variable;

/**
 * @Description char字符变量的使用
 * @Date 2022/8/2 0:26
 * 在Java中char字符的本质是一个整数，在默认输出时，是unicode码对应的字符
 * 要输出字符对应的数字可以（int）字符
 */
public class Char01 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t'; // \t合起来表示一个字符
        char c3 = '远';
        char c4 = 97; // 说明：字符类型可以直接存放一个数字

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4); // 当输出c4的时候，会输出97表示的字符 =>设计到编码的概念

        char c5 = 'a';
        System.out.println("c5 = " + c5);

        System.out.println("c5 = " + (int) c5); // 输出‘a’字符对应的数字

        char name1 = '姚';
        char name2 = '远';
        System.out.println((int) name1 + name2); // 输出59830

        // 计算器存储字符类型的过程：字符 ‘a’-->unicode对应的码值97-->二进制110 0001==》存储。
    }
}
