package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Quacking;


import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
