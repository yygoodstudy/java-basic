package com.yy.genericity;

import com.yy.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 泛型类的使用
 *
 * @param <T>
 */
public class GenericityClass<T> {

    private List<T> objList = null;
    private Set<T> objSet = null;

    public void setObjList(List<T> objList) {
        this.objList = objList;
    }

    public List<T> getObjList() {
        return this.objList;
    }

    public Set<T> getObjSet() {
        return objSet;
    }

    public void setObjSet(Set<T> objSet) {
        this.objSet = objSet;
    }
}

class Main {
    // 泛型类的使用过
    public static void main(String[] args) {
        GenericityClass<Person> personGenericityClass = new GenericityClass<>();
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("张洁", 27, 10000.00, "6125241995XXXXXXXX"));
        peoples.add(new Person("姚远", 27, 13000.00, "61252419930417307X"));
        personGenericityClass.setObjList(peoples);
        List<Person> objList = personGenericityClass.getObjList();
        for (Person person : objList) {
            System.out.println(person);
        }
    }
}