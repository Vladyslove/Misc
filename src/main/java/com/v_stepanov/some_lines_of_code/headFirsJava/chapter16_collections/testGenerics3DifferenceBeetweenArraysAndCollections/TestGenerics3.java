package com.v_stepanov.some_lines_of_code.headFirsJava.chapter16_collections.testGenerics3DifferenceBeetweenArraysAndCollections;

public class TestGenerics3 {

    public static void main(String[] args) {
        new TestGenerics3().go();
    }

    private void go() {
        Dog [] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(dogs);
    }

    private void takeAnimals(Animal []animals) {
            animals[0] = new Cat();
        }
    }

abstract class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void bark() {}
}

class Cat extends Animal {
    void meow() {}
}