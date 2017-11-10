package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.testexamples;

public class Animal {
    void makesound(){};
}

class Runner {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makesound();
    }
}
