package com.yy.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description TODO
 * @Date 2022/8/26 0:24
 */
public class Java8FunctionalInterfaceTest {
    // Consumer<T>:java8提供的消费性接口
    public static void happy(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    //Supplier<T>:java8提供的供给型接口
    public static List<Integer> generate(Integer number, Supplier<Integer> supplier) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer i = 0; i < number; i++) {
            numbers.add(supplier.get());
        }
        return numbers;
    }

    public static void main(String[] args) {
        happy(1000d, d -> System.out.println("消费：" + d + "元"));

        List<Integer> list = generate(5, () -> (int) (Math.random() * 10));
        list.forEach(System.out::println);

    }
}
