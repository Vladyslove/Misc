package com.v_stepanov.some_lines_of_code.headFirsJava.chapter14_serializationAndFileIO.savingAndRerstoringGameCharacters;

import java.io.*;

/**
 * Created by User on 18.09.2017.
 */
public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword"});
        GameCharacter two = new GameCharacter(40, "Troll", new String[] {"bare hands", "big ax"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/resources/headFirstJava/chapter14/Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        one = null;
        two = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("src/main/resources/headFirstJava/chapter14/Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();

            System.out.println("One's type is: " + oneRestore.getType());
            System.out.println("Two's type is: " + twoRestore.getType());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
