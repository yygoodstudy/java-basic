package com.yy.reflection;

import com.yy.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection03 {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        Field declaredField = aClass.getDeclaredField("name");
        Class<?> type = declaredField.getType();
//        System.out.println(type);

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
//            field.setAccessible(true);
            System.out.println("field.getName() = " + field.getName());
//                field.setAccessible(true);
            if (field.getName().equals("age")) {
                field.set(person, 18); // 给属性设置值
                Object o = field.get(person); // 通过反射获取Person对象的值
                System.out.println("o = " + o);
            }

        }
        System.out.println("person = " + person);

        System.out.println("-----------------");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("===================");
        Method[] methods1 = aClass.getMethods();
        for (Method method : methods1) {
            System.out.println(method.getName());
        }

        System.out.println("++++++++++++++++++++");
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("interfaces.getClass() = " + anInterface);
        }
    }
}
