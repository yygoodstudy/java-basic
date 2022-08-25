package com.yy.variable;

/**
 * @Description TODO
 * @Date 2022/8/2 1:33
 */
public class Calculate01 {
    public static void main(String[] args) {
        short s = 12;
//        s = s-9; // 报错：：：：s = 12是short类型，在与int计算时会自动转为int类型，在赋值给short类型，需要强制类型转换
        byte b = 10;
//        b = b +11;  // 报错：：和上面同理
        b = (byte) (b + 11); // 正确，强制将 int类型转为byte类型，但是可能会造成数据溢出，结果不准确.
    }
}
