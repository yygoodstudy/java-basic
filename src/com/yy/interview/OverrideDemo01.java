package com.yy.interview;

/**
 * @Description TODO
 * @Date 2022/8/9 23:17
 */
public class OverrideDemo01 {
    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello();
    }


}

class Father {
    protected void sayHello() {
        System.out.println("hello");
    }

    // 本类中两个方法名相同，参数列表不同，其它无限制
    public String sayHello(String name) throws Exception { // 重载：方法名相同，参数列表不同
        System.out.println("hello " + name);
        return name;
    }
}

class Son extends Father {
    @Override // 重写 1.方法名相同，参数列表相同，返回值类型要么相同要么是父类返回值类型的子类，访问修饰符不能严于父类；public>protected>default>private
    public void sayHello() {
        System.out.println("hello by....");
    }
}
