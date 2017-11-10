package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.Duck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Flying.FlyNoWay;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
