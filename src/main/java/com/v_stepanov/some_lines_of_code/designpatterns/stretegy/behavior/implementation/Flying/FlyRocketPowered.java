package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Flying;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior  {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
