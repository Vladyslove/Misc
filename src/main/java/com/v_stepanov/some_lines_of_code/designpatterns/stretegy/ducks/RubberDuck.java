package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.Duck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

    @Override
    public void quack() {
    }

    @Override
    protected void display() {
//        super.display();
    }
}
