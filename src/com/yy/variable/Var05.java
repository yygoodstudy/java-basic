package com.yy.variable;

/**
 * @Description 整数,浮点数使用
 * @Date 2022/8/1 1:05
 */
public class Var05 {
    public static void main(String[] args) {
        byte n1 = 10;
        short n2 = 10; // 虽然n1,n2变量的值都是10，但是n2占用的内存要大一点，因为是short类型，它占2个字节，是byte类型占用内存的两倍；
        int a = 1;
//        int b = 1L; // 这样写是不对的，因为1L是long类型，编译器认为long类型不能转为int类型，8个字节转为4个字节可能会损失精度；
        long b = 1l;
        // --------------------------------------------------------十进制------------------------------------------------
//        float f1 = 1.11; // 不兼容的类型: 从double转换到float可能会有损失
        float f1 = 1.11F;
        double f2 = 1.11d;
        double f3 = 1.23D;
        double f4 = 11.123f; // 小的类型给大的类型赋值，没毛病，但是不建议这样使用，这样会造成空间浪费
        int a1 = 3;
        char c1 = '远';
        double f5 = .123; // 如果是浮点数，小数点前面是0的话可以直接省略，直接写成.123;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("c1 = " + c1);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);

        // ---------------------------------------------------科学计数法------------------------------------------------
        double d1 = 520.12e3; //相当于520.02*10的2次方
        double d2 = 1.123e9; // 相当于1.123*10的9次方
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // --------------------------------------------------

        // 通常情况下建议使用double类型，因为它比float类型更精确；
        double num1 = 2.1234124545;
        float num2 = 2.1234124545f;
        System.out.println("num1 = " + num1); // num1 = 2.1234124545
        System.out.println("num2 = " + num2); // num2 = 2.1234124

        //
        double num11 = 2.7;
        double num12 = 8.1 / 3;
        System.out.println("num11 = " + num11); // num11 = 2.7
        System.out.println("num12 = " + num12); // num12 = 2.6999999999999997;近似值，接近于2.7但不是2.7
        if (num11 == num12) {
            System.out.println("相等"); // 不输出
        }

        double abs = Math.abs(num11 - num12);
        System.out.println("abs = " + abs);
        if (Math.abs(num11 - num12) < 0.000001) {
            System.out.println("相等"); // 输出相等
        }

        String name = "yáo yuǎn ";
        System.out.println("name = " + name);
    }
}
