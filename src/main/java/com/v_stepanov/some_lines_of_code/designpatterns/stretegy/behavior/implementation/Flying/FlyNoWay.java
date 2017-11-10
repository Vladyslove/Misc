package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Flying;


import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot FLy");
    }
}
