package com.yy.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 根据配置文件 re.properties的指定信息，创建Person对象并调用方法
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullname = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");

        // 通过反射机制创建对象
        // 初始化某个类(会运行该类的静态块)，aClass对象每个类独有一份，存在堆中，像一面镜子，可以通过Class类的API获取该类的成员变量、方法、构造方法
        Class<?> aClass = Class.forName(classfullname);

        Object o = aClass.newInstance(); // 通过反射创建某类的实例
        System.out.println("o的运行时类型为：" + o.getClass());

        Method method = aClass.getMethod(methodName);
        method.invoke(o);

    }
}
