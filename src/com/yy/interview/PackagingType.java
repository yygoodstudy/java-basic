package com.yy.interview;

/**
 * @Description TODO
 * @Date 2022/8/18 19:02
 */
public class PackagingType {
    public static void main(String[] args) {
        Object a = 0;
        Integer b = new Integer(0);
        boolean flag = a.equals(b);
        System.out.println("flag = " + flag);

        String[] strArr = "hello-world-java".split("-");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
