package headFirsJava.chapter12;

/**
 * Created by User on 11.09.2017.
 */
public class MyOuterClass {
    private int x;
    class MyInnerClass {
        void go() {
            x = 42; // use 'x' as if it were a variable of the inner class
            // inner class in fully enclosed by outer class
        }
    } //close inner class
} // close outer class
