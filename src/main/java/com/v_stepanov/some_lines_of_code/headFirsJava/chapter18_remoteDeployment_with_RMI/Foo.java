package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI;

/**
 * Created by User on 02.10.2017.
 */
public class Foo {
    void go() {
        Bar b = new Bar();
        b.doStuff();


    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.go();
    }

}

class Bar {
    void doStuff() {
        // Method is doing smth
        System.out.println("Hi I'm method doStuff");
    }

}
