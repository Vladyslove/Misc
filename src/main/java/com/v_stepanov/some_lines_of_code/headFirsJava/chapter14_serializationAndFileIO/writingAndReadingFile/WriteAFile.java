package com.v_stepanov.some_lines_of_code.headFirsJava.chapter14_serializationAndFileIO.writingAndReadingFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 19.09.2017.
 */
public class WriteAFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/resources/headFirstJava/chapter14/MyCode.txt")) {
            writer.write("hello, MyCode!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f = new File("src/main/resources/headFirstJava/chapter14/MyCode.txt");
        File dir = new File("src/main/resources/headFirstJava/chapter14/DirCreation");
        dir.mkdir();
        File innerDir = new File("src/main/resources/headFirstJava/chapter14/DirCreation/OneLevelDipperDir");
        innerDir.mkdir();

        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        System.out.println(f.getAbsolutePath());
        System.out.println(dir.getAbsolutePath());
    }
}
