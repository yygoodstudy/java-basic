package com.yy.java8.lambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 测试lambda表达式1
 * @Date 2022/8/22 16:19
 */
public class LambdaTest01 {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("张洁", 27, 5000d));
        employeeList.add(new Employee("姚远", 29, 11000d));
        employeeList.add(new Employee("张三", 37, 15000d));
        employeeList.add(new Employee("王五", 47, 25000d));
    }

    /**
     * 匿名内部类写法
     */
    public void testAnonymousInnerClass() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        List<Integer> list = Arrays.asList(1, 10, 11, 0, 9, 6, 8);
        Collections.sort(list, comparator);
        System.out.println(list);
    }

    /**
     * Lambda表达式的写法
     */
    public void testLambda01() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        List<Integer> list = Arrays.asList(1, 10, 11, 0, 9, 6, 8);
        Collections.sort(list, comparator);
        System.out.println(list);
    }

    /**
     * 按照年龄过滤员工
     */
    public List<Employee> filterEmployeesByAge(List<Employee> employees) {
        ArrayList<Employee> newEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() < 30) {
                newEmployees.add(employee);
            }
        }
        return newEmployees;
    }

    /**
     * 按照工资过滤员工
     */
    public List<Employee> filterEmployeesBySalary(List<Employee> employees) {
        ArrayList<Employee> newEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() <= 10000) {
                newEmployees.add(employee);
            }
        }
        return newEmployees;
    }

    // 以上两种方法重复性过高，优化方式1：策略设计模式
    public List<Employee> filterEmpByPredicate(List<Employee> employees, MyPredicate<Employee> predicate) {
        List<Employee> temps = new ArrayList<>();
        for (Employee emp : employees) {
            if (predicate.judge(emp)) {
                temps.add(emp);
            }
        }
        return temps;
    }

    // 思考：如果我们的过滤条件变成需要查出员工工资小于10000的员工，还需要修改MyPredicate中的代码，这种方式还不是很好，考虑是否可以将过滤条件单独过滤出来？
    // 优化方式2：
    public List<Employee> filterEmpByPredicateLambda(List<Employee> employees, MyPredicate<Employee> predicate) {
        List<Employee> temps = new ArrayList<>();
        for (Employee employee : employees) {
            if (predicate.judge(employee)) {
                temps.add(employee);
            }
        }
        return temps;
    }

    public static void main(String[] args) {
        LambdaTest01 lambdaTest01 = new LambdaTest01();
//        lambdaTest01.testLambda01();
//        List<Employee> employeeList = lambdaTest01.filterEmployeesByAge(LambdaTest01.employeeList);
//        System.out.println(employeeList);

//        List<Employee> employeeList1 = lambdaTest01.filterEmployeesBySalary(LambdaTest01.employeeList);
//        System.out.println(employeeList1);
//        EmployeePredicate predicate = new EmployeePredicate();
        // 优化方式1：
//        List<Employee> employeeList = lambdaTest01.filterEmpByPredicate(LambdaTest01.employeeList, predicate);
//        System.out.println(employeeList);
        // 优化方式2：匿名内部类
       /* MyPredicate<Employee> myPredicate = new MyPredicate<Employee>() {
            @Override
            public boolean judge(Employee employee) {
                return employee.getSalary() <= 10000d;
            }
        };*/

        // 优化方式3：lambda表达式
//        MyPredicate<Employee> myPredicate = (Employee e) -> e.getSalary() <= 11000;
//        List<Employee> employeeList = lambdaTest01.filterEmpByPredicateLambda(LambdaTest01.employeeList, myPredicate);
//        System.out.println(employeeList);


        // 优化方式4：stream API
        List<Employee> employees = employeeList.stream()
                .filter((e) -> e.getName().equals("张洁") || e.getName().equals("姚远"))
                .collect(Collectors.toList());
        employees.forEach(System.out::println);

        System.out.println("-----------------------------");
        employeeList.stream()
                .filter((e) -> e.getAge() >= 29) // 过滤
                .limit(2) // 去集合中的前两个
                .forEach(System.out::println); // 遍历输出

        employeeList.stream()
                .map(Employee::getName) // 取出所有员工的姓名
                .forEach(System.out::println); // 遍历输出
    }
}
