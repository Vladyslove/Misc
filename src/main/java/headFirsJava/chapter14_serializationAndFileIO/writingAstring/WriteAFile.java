package headFirsJava.chapter14_serializationAndFileIO.writingAstring;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 19.09.2017.
 */
public class WriteAFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/resources/headFirstJava/chapter14/Foo.txt")) {
            writer.write("hello, foo!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
