package com.reflection.models;

import com.reflection.annotation.MethodTest;
import com.reflection.annotation.*;

public class Cat {

    private int legs;

    public Cat(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @MethodTest
    public void setColor() {
        System.out.println("This works");
    }

    @MethodTest
    public void getLegsTest() {
        Cat cat = new Cat(3);
        int numLegs = cat.getLegs();
        CatUnit.assertValid(3, numLegs);

    }

    @MethodTest
    public void getLegsTest1() {
        Cat cat = new Cat(3);
        int numLegs = cat.getLegs();
        CatUnit.assertValid(3, numLegs);

    }

    @MethodTest
    public void getLegsTest2() {
        Cat cat = new Cat(3);
        int numLegs = cat.getLegs();
        CatUnit.assertValid(2, numLegs);

    }

}
