package com.yy.variable;

/**
 * @Description java中‘+’号的使用
 * @Date 2022/8/1 0:35
 */
public class Var04 {
    /*
        1.当左右两边都是数值型时，则作加法运算
        2.当左右一边是字符串类型时，做字符串拼接
     */
    public static void main(String[] args) {
        System.out.println(1 + 2); // 输出：3
        System.out.println("1" + 2); // 输出：12
        System.out.println("100" + 3 + 1); // 输出：10031
        System.out.println(3 + 1 + "100"); // 输出：4100，先算3+1左右两边都是数值型加完结果为4，然后将数值型4再加上字符串“100”，作字符串拼接得到4100
    }
}
