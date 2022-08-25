package com.yy.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2022/8/18 19:46
 */
public class NameList {
    private List names = new ArrayList();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void printAll() {
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + "");
        }
    }

    public static void main(String[] args) {
        final NameList sl = new NameList();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                sl.add("A");
                sl.add("B");
                sl.add("C");
                sl.printAll();
            }).start();
        }
    }
}
