package com.yy.java8.lambda;

/**
 * @Description TODO
 * @Date 2022/8/22 11:50
 */
public class LambdaDemo1 {

    interface Printer {
        void print(String val);
    }

    interface Cal {
        int add(int a, int b);
    }

    public void printSomething(String something, Printer printer) {
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo1 ld1 = new LambdaDemo1();
        String something = "Pink Venom";
        // 传统写法：
        /*Printer printer = new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };*/

        // lambda写法：如果有一个参数，则参数的类型，和括号都可以省略；如果方法体只有一行代码则花括号也可以省略；
        /*Printer printer = (String val)->{
            System.out.println(val);
        };*/

      /*  Printer printer = (val)->{
            System.out.println(val);
        };*/

       /* Printer printer = val->{
            System.out.println(val);
        };*/

        Printer printer = val -> System.out.println(val);
        ld1.printSomething(something, printer);

        Cal cal = new Cal() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(cal.add(1, 2));

        Cal cal1 = (a, b) -> a + b;
        System.out.println(cal1.add(3, 2));
    }
}
