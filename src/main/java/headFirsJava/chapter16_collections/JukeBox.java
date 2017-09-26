package headFirsJava.chapter16_collections;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 27.09.2017.
 */
public class JukeBox {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox().go();

    }

    private void go() {
        getSongs();
        System.out.println(songList);
    }

    private void getSongs() {
        File file = new File("SongList.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addSong(String line) {
        
    }
}
