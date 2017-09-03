package headFirsJava.chapter13;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

/**
 * Created by User on 03.09.2017.
 */
public class MusicTest1 {

    public void play() {
        Sequencer sequencer = MidiSystem.getSequencer();

        System.out.println("We got a sequencer");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
