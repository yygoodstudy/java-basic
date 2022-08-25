package com.yy.reflection.clazz;

import com.yy.Person;

public class Class02 {
    public static void main(String[] args) throws Exception {
        Class<?> a = Class.forName("com.yy.Person");
        Class<Person> b = Person.class;
        Class<? extends Person> c = new Person().getClass();

        ClassLoader classLoader = Person.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("com.yy.Person");
        System.out.println("aClass = " + aClass);

        Class<Character> type = Character.TYPE;
        System.out.println(type);
    }
}
