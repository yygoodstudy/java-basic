package com.yy.java8.lambda;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean judge(T t);
//    boolean jud();
}
