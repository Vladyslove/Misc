package headFirsJava.chapter12;

/**
 * Created by User on 11.09.2017.
 */
public class MyOuterClass {
    private int x; // outer class has a private instance variable 'x'

    MyInnerClass myInnerClass = new MyInnerClass(); // make an instance of the inner class

    public void doStuff() {
        myInnerClass.go(); // call a method on the inner class
    }
    class MyInnerClass {
        void go() {
            x = 42; // use 'x' as if it were a variable of the inner class
            // inner class in fully enclosed by outer class
        }
    } //close inner class
} // close outer class
