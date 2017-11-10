package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.testexamples;

public class Dog extends Animal {
    @Override
    void makesound() {
        bark();
    }

    private void bark() {
        System.out.println("GUb");
    }
}
