package com.yy.genericity;

import com.yy.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericityMethodTest {
    public <T> T findObj(List<T> list){
        for (T t : list) {
            if (t instanceof Person){
                Person person = (Person) t;
                if (person.name.equals("张洁")){
                    System.out.println("姚远❤张洁");
                    return t;
                }
            }
        }
        return null;
    }
}
class MainTest{
    public static void main(String[] args) {
        GenericityMethodTest methodTest = new GenericityMethodTest();
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("张洁", 18, 10000.00, "6125241995xxxxxxxx"));
        peoples.add(new Person("姚远", 20, 13000.00, "61252419930417307X"));
        Person p = methodTest.findObj(peoples);
        System.out.println(p);
    }
}