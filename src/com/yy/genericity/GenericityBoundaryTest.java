package com.yy.genericity;

public class GenericityBoundaryTest {
    public static void main(String[] args) {
        Gbt gbt = new Gbt();
        String str = gbt.getObj("hello world");
        Object obj = gbt.getObj(new Object());
        Integer age = gbt.getObj(23);
        Boolean flag = gbt.getObj(false);
    }

}

class Gbt {
    public <T> T getObj(T obj) {
        return obj;
    }
}