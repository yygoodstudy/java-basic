package com.yy.variable;

/**
 * @Description 强制类型转换细节：数据类型大的转换为小的
 * @Date 2022/8/2 1:11
 */
public class AutoConvertDetail02 {
    public static void main(String[] args) {
        // 会报错，因为10 * 3.5转换为int后为35，再加上9.0，35首先会自动提升为double类型相加结果仍为double,不能直接将double赋值给int类型
//        int v = (int)10 * 3.5 + 6 * 1.5;
        double v = 10 * 3.5 + 6 * 1.5;
        System.out.println("v = " + v); // 44.0

        int i = (int) (10 * 3.5 + 6 * 1.5);
        System.out.println("i = " + i); // 44
    }
}
