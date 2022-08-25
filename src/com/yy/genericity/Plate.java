package com.yy.genericity;

import java.util.ArrayList;
import java.util.List;

public class Plate<T extends Fruit> {
    private T fruit;

    public Plate(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}


class Food {
}

class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

class TestMain {
    public static void main(String[] args) {
        Plate<Fruit> applePlate = new Plate(new Apple());
        List<? super Fruit> objects = new ArrayList<>();
        objects.add(new Apple());
        objects.add(new Fruit());
    }
}