package headFirsJava.chapter14_serializationAndFileIO.serializeAllOrNothing;

import java.io.*;

/**
 * Created by User on 18.09.2017.
 */
public class Pond implements Serializable {

    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();

        try (FileOutputStream fs = new FileOutputStream("Pond.ser")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
