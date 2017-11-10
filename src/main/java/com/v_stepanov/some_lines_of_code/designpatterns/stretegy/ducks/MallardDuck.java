package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.Duck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.Flyable;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    protected void display() {
//        super.display();
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
