package com.yy.java8.lambda;

/**
 * @Description TODO
 * @Date 2022/8/22 16:55
 */
public class EmployeePredicate implements MyPredicate<Employee> {
    @Override
    public boolean judge(Employee employee) {
        return employee.getAge() <= 30;
    }
}
