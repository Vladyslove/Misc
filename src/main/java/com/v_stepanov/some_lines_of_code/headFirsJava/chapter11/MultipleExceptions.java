package com.v_stepanov.some_lines_of_code.headFirsJava.chapter11;

/**
 * Created by User on 04.09.2017.
 */
public class MultipleExceptions {

}
 class Laundry{
    public void doLaundry() throws PantsException, LingerieException {

    }

     class LingerieException extends Exception {
     }

     class PantsException extends Exception {
     }
 }

 class Foo {
    public void go() {
        Laundry laundry = new Laundry();

        try {
            laundry.doLaundry();
        } catch (Laundry.PantsException e) {
            e.printStackTrace();
        } catch (Laundry.LingerieException e) {
            e.printStackTrace();
        }
    }
 }
