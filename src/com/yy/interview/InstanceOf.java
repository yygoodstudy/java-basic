package com.yy.interview;

/**
 * @Description TODO
 * @Date 2022/8/9 22:04
 */
public class InstanceOf {
    public static void main(String[] args) {
        Integer a = 29;
        boolean flag = a instanceof Integer;
        System.out.println("flag = " + flag);
        System.out.println(null instanceof Object);

        Integer a1 = 100;
        Integer a2 = 100;
        Integer a3 = 200;
        Integer a4 = 200;

        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
    }
}
