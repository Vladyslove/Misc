package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.testexamples;

public class Cat extends Animal {
    @Override
    void makesound() {
        mew();
    }

    private void mew() {
        System.out.println("Meow");
    }
}
