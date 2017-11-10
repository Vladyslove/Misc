package com.v_stepanov.some_lines_of_code.designpatterns.stretegy;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.FlyBehavior;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.QuackBehavior;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    void perfromQuack() {
        quackBehavior.quack();
    }
    void perfromFly() {}
    void swim(){    }
    protected void display(){    }

}
