package com.v_stepanov.some_lines_of_code.designpatterns.stretegy;

import com.v_stepanov.some_lines_of_code.designpatterns.stretegy.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.perfromQuack();
        mallard.perfromFly();
    }
}
