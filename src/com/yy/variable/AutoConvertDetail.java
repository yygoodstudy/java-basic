package com.yy.variable;

/**
 * @Description 强制类型转换细节：数据类型大的转换为小的
 * @Date 2022/8/2 1:11
 */
public class AutoConvertDetail {
    public static void main(String[] args) {
        // 有多种数据类型混合运算时，系统首先自动将所有数据类型转成容量大的数据类型，然后再进行运算.
        int n1 = 10;
//        float n2 = n1 + 1.1; // 错误的写法，n1是int类型，1.1是double类型，默认将int类型转为容量大的数据类型也就是1.1,得到结果还是
        // double类型，double的精度高于float类型，所以不能直接赋值，如果需要赋值则需要进行强制类型转换.
        double n3 = n1 + 1.1;
        System.out.println("n3 = " + n3);
        float n4 = n1 + 1.1f;

        // 强制类型转换可能造成精度降低或溢出，需要格外注意。
        int a = (int) 1.9;
        System.out.println("a = " + a); // 1；造成精度损失

        int j = 190;
        byte b1 = (byte) j;
        System.out.println("b1 = " + b1); // -66；造成数据溢出
    }
}
