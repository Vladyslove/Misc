package headFirsJava.chapter13.exercisesInTheEndOfChapter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 16.09.2017.
 */
public class CodeFragments {

    public static void main(String[] args) {
        CodeFragments gui = new CodeFragments();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("safari");
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
