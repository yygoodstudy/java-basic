package com.yy.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

    // Function<R,T>
    public static String apply(String str, Function<String,String> function){
        return function.apply(str);
    }

    public static List<String> stringFilter(List<String> list, Predicate<String> predicate){
        List<String> strings = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                strings.add(s);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        happy(1000d, d -> System.out.println("消费：" + d + "元"));

        List<Integer> list = generate(5, () -> (int) (Math.random() * 10));
        list.forEach(System.out::println);

        String apply = apply(" hello-world ", s -> s.toUpperCase().trim());
        System.out.println("apply = " + apply);

        List<String> strings = stringFilter(Arrays.asList("he", "ha", "hehe", "haha", "heihei"), x -> x.length() >= 3);
        System.out.println(strings);
    }
}
