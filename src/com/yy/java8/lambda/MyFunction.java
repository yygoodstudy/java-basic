package com.yy.java8.lambda;

@FunctionalInterface
public interface MyFunction<T> {
    T calculate(T t);
}
