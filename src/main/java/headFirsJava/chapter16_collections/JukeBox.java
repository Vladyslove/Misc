package headFirsJava.chapter16_collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 27.09.2017.
 */
public class JukeBox {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox().go();

    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("src/main/resources/headFirstJava/chapter16/SongList.txt");
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

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);

    }
}
