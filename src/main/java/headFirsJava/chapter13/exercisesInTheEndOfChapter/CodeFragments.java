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
//        gui.go2();
//        gui.go3();
//        gui.go4();
//        gui.go5();
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

    private void go2() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("safari");

        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250,250);
        frame.setVisible(true);
    }

    private void go3() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("safari");

        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setSize(250,250);
        frame.setVisible(true);
    }

    private void go4() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("safari");

        panel.add(button);
        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST,panel);

        frame.setSize(250,250);
        frame.setVisible(true);
    }

    private void go5() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("safari");

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
