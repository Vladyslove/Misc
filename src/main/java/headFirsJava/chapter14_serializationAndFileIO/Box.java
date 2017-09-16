package headFirsJava.chapter14_serializationAndFileIO;

import java.io.*;

/**
 * Created by User on 16.09.2017.
 */
public class Box implements Serializable {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream fs = new FileOutputStream("src/main/resources/headFirstJava/chapter14/foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
