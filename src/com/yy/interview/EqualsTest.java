package com.yy.interview;

/**
 * @Description == 和 equals的区别：
 * @Date 2022/8/9 23:27
 */
public class EqualsTest {
    public static void main(String[] args) {
        Company company = new Company();
        ChildCompany childCompany = new ChildCompany();
        boolean equals = company.equals(childCompany);
        System.out.println(equals);
        boolean b = 3 * 0.1 == 0.3; // false
        System.out.println("b = " + b);
        byte a = 127;
        byte c = 127;
        c += a;
        System.out.println("c = " + c); // -2
    }
}

class Company {
}

class ChildCompany {
}
