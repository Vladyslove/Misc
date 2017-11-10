package com.v_stepanov.some_lines_of_code.headFirsJava.chapter14_serializationAndFileIO.writingAndReadingFile;

import java.io.*;

/**
 * Created by User on 19.09.2017.
 */
public class ReadAFIle {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/resources/headFirstJava/chapter14/MyText.txt")) {
            writer.write("some text" + "\n" + "another some text");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File myFile = new File("src/main/resources/headFirstJava/chapter14/MyText.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
