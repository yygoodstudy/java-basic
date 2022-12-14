package com.yy.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description Lambda表达式练习
 * @Date 2022/8/22 19:17
 */
public class LambdaExercise01 {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("张洁", 27, 5000d));
        employeeList.add(new Employee("姚远", 29, 11000d));
        employeeList.add(new Employee("张三三", 37, 15000d));
        employeeList.add(new Employee("赵六六子", 37, 19000d));
        employeeList.add(new Employee("李思", 37, 11000d));
        employeeList.add(new Employee("王五", 47, 25000d));
    }

    public static void main(String[] args) {
        List<Employee> employeeList = sortEmployees(LambdaExercise01.employeeList, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        employeeList.forEach(System.out::println);
    }

    // 调用Collections.sort()方法，通过定制排序比较两个emp
    // employee(先按年龄比，年龄相同再按姓名比),使用Lambda表达式作为参数
    private static List<Employee> sortEmployees(List<Employee> employees, Comparator<Employee> comparator) {
        Collections.sort(employees, comparator);
        return employees;
    }

}
