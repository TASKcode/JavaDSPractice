package com.demo.java.code.base;

import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.KeyCode.M;

public class DerivedAnimal extends Animal {

    public void typesOfAnimal(String builder) {
        System.out.println("Declare Type of DerivedAnimals: " + builder);
    }

    public void someAnimal() {
        System.out.println("Animal is :: Human ");
    }

    public static void main(String[] args) {
        DerivedAnimal obj = new DerivedAnimal();
        obj.typesOfAnimal("Elephant");

        Animal animal = new DerivedAnimal();
        animal.typesOfAnimal("Dog");
        ((DerivedAnimal) animal).someAnimal();

        Animal example = new Animal();
        example.typesOfAnimal("Horse");

        Map map = new HashMap();
        map.put(obj, 10);
        System.out.println("Output:: " + map.get(obj));

    }
}
