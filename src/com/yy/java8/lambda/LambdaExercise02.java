package com.yy.java8.lambda;

/**
 * @Description TODO
 * @Date 2022/8/25 23:52
 */
public class LambdaExercise02 {

    @FunctionalInterface
    interface StringOptions {
        String getValue(String value);
    }

    public static String option(String value, StringOptions is) {
        return is.getValue(value);
    }

    public static void main(String[] args) {
        String str = option("hello world", x ->x.toUpperCase());
        System.out.println(str);

        String newStr = option("abcdefghijklm", x -> x.substring(2, 4));
        System.out.println("newStr = " + newStr);

    }

}
