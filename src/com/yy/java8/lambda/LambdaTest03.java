package com.yy.java8.lambda;

/**
 * @Description TODO
 * @Date 2022/8/26 0:02
 */
public class LambdaTest03 {
    interface MyFunction<T, R> {
        R function(T t1, T t2);
    }

    public static Long calculate(MyFunction<Long, Long> myFunction, Long t1, Long t2) {
        return myFunction.function(t1, t2);
    }

    public static void main(String[] args) {
        Long aLong = calculate((x, y) -> x * y, 11L, 2L);
        System.out.println(aLong);
    }
}
