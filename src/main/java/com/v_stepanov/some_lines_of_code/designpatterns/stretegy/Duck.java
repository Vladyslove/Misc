package com.v_stepanov.some_lines_of_code.designpatterns.stretegy;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.FlyBehavior;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    void perfromFly() {
        flyBehavior.fly();
    }
    public void perfromQuack() {
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All duck float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
