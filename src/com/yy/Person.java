package com.yy;

public class Person implements Runnable{
    public String name;
    public int age;
    double salary; // double salary;
    protected String idCardNumber;

    public Person() {
    }

    public Person(String name, int age, double salary, String idCardNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.idCardNumber = idCardNumber;
    }

    public void hi() {}

    private void introduce(){}
    protected void m2(){};

    public void show() {
        System.out.println("hello everyone~ my name is " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", idCardNumber='" + idCardNumber + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}
