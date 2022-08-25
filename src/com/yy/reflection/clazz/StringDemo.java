package com.yy.reflection.clazz;

public class StringDemo {
    public static void main(String[] args) {
        String ss = "abcdefghijklmnopqrst";
        int index = ss.lastIndexOf(101);
        char c = ss.charAt(index);
        System.out.println(c);
    }
}
