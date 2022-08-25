package com.yy.java8.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Description Lambda表达式基本语法
 * @Date 2022/8/22 19:59
 */
public class LambdaTest02 {

    public static void main(String[] args) {

//        testLambda01();
//        testLambda02();
        testMyFunction(3, x -> x * x);
        testMyFunction(2, x -> x - 1);
    }


    // 语法格式1：无参数，无返回值
    private static void testLambda01() {
        // 匿名内部类写法：
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        // Lambda表达式写法：
        Runnable runnable = () -> System.out.println("hello world");

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }

    // 语法格式2：有一个参数，无返回值
    private static void testLambda02() {
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("时间总是不听话，思念也开始装傻~");

        Consumer<String> consumer1 = something -> System.out.println(something);
        consumer1.accept("白月光与朱砂痣~~~");
    }

    // 有两个参数，并且有返回值
    private static void testLambda03() {
        Comparator<Integer> comparator = (Integer x, Integer y) -> {
            if (x > y)
                return 1;
            else
                return 0;
        };
        // 参数的类型可以写，也可以不写,方法体中只有一条语句并且有返回值的话，方法体的花括号和return都可以不写
        Comparator<Integer> comparator1 = (x, y) -> Integer.compare(x, y);

        Comparator<Integer> comparator2 = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    private static void testMyFunction(Integer num, MyFunction<Integer> myFunction) {
        Integer val = myFunction.calculate(num);
        System.out.println("val = " + val);
    }
}
