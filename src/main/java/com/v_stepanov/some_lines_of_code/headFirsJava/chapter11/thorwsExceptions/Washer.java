package com.v_stepanov.some_lines_of_code.headFirsJava.chapter11.thorwsExceptions;

/**
 * Created by User on 04.09.2017.
 */
public class Washer {
    Laundry laundry = new Laundry();

    public void foo() throws ClothingException {
        laundry.doLaundry();
    }

    public static void main(String[] args) throws ClothingException {
        Washer w = new Washer();
        w.foo();
    }
}

class Laundry {
    void doLaundry() throws ClothingException {}
}

class ClothingException extends Exception {}
