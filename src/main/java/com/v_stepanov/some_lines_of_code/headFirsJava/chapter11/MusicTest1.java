package com.v_stepanov.some_lines_of_code.headFirsJava.chapter11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by User on 03.09.2017.
 */
public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            System.out.println("Bummer");
        }

        System.out.println("We got a sequencer");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
