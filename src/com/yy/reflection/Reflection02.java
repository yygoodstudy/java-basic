package com.yy.reflection;

import com.yy.Person;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection02 {

    public static void main(String[] args) throws Exception {
        Reflection02 re = new Reflection02();
        re.m1();
        re.m2();
    }


    public void m1() {
        Person person = new Person();
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 900000000; i++) {
            person.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用耗时：" + (end - start));
    }

    public void m2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classFullName = properties.getProperty("classfullpath");
        Class<?> cls = Class.forName(classFullName);
        Object o = cls.newInstance();
        Method method = cls.getMethod("hi");
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 900000000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用耗时：" + (end - start));
    }
}
