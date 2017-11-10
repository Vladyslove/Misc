package com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.Duck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Flying.FlyWIthWings;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Quacking.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWIthWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
