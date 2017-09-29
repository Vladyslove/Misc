package com.v_stepanov.some_lines_of_code.headFirsJava.chapter14_serializationAndFileIO.serializeAllOrNothing;

import java.io.*;

/**
 * Created by User on 18.09.2017.
 */
public class Pond implements Serializable {

    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        Object object;

        try (FileOutputStream fs = new FileOutputStream("src/main/resources/headFirstJava/chapter14/Pond.ser")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream
                    ("src/main/resources/headFirstJava/chapter14/Pond.ser"));
            Pond duckRestore = (Pond) is.readObject();
            System.out.println("duckRestore type is:" + duckRestore.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
