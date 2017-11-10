package com.v_stepanov.some_lines_of_code.headFirsJava.chapter11.multipleExceptions;

/**
 * Created by User on 04.09.2017.
 */
public class MulptipleExceptionsHandling {
}

    class Laundry{
        public void doLaundry() throws LingerieException, ClothingException, TeeShirtException{

        }
    public static void main(String[] args) {
        Laundry laundry = new Laundry();
        try {
            laundry.doLaundry();
        } catch (LingerieException e) {
            e.printStackTrace();
        } catch (TeeShirtException e) {
            e.printStackTrace();
        } catch (ClothingException e) {
            e.printStackTrace();
        }
    }
}

    class ClothingException extends Exception {
    }

    class TeeShirtException extends ClothingException {
    }

     class LingerieException extends TeeShirtException {
    }
