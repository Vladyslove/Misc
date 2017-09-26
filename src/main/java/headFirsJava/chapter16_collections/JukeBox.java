package headFirsJava.chapter16_collections;

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

    }
}
