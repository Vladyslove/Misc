package com.v_stepanov.some_lines_of_code.designpatterns.stretegy;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.behavior.implementation.Flying.FlyRocketPowered;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks.MallardDuck;
import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perfromQuack();
        mallard.perfromFly();

       /* // My test code
       FlyBehavior flyBehavior = new FlyWIthWings();
        mallard.flyBehavior.fly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.perfromFly();*/

        Duck modelDuck = new ModelDuck();
        modelDuck.perfromFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perfromFly();
    }
}
