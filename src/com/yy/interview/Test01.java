package com.yy.interview;

/**
 * @Description TODO
 * @Date 2022/8/17 19:57
 */
public class Test01 {

    private static int i = 1;

    public int getNext() {
        return i++;
    }

    public static void main(String[] args) {
        Test01 test = new Test01();
        Test01 testObject = new Test01();
        int next = test.getNext();
        System.out.println("next = " + next);
        int next1 = testObject.getNext();
        System.out.println("next1 = " + next1);
        System.out.println(testObject.getNext());
    }
}
