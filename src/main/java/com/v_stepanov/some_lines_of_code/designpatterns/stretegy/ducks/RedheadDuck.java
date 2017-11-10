package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.Duck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.FlyBehavior;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.QuackBehavior;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void display() {
//        super.display();
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
