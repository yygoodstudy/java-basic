package com.yy.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射问题的引入
 */
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

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

        // getField()方法不能获取私有的字段；
//        Field name = aClass.getField("name");

        aClass.getDeclaredField("name");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // 取消属性访问时进行的访问检查；提高反射效率
            System.out.println("field.getName() = " + field.getName());
            if (field.getName().equals("age")) {
                field.set(o, 27);
            }
            if (field.getName().equals("salary")) {
                field.setDouble(o,13000.00);
            }

            if (field.getName().equals("idCardNumber")) {
                field.set(o,"61252419970236422565");
            }

        }
        System.out.println("o = " + o);

        System.out.println("---------------------------");
        Field[] fields1 = aClass.getFields();
        for (Field field : fields1) {
            System.out.println(field.getName());
        }
    }
}
