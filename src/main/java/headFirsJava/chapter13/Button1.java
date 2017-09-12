package headFirsJava.chapter13;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 13.09.2017.
 */
public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
//        gui.go();
        gui.go1();
    }

    private void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click like you mean it");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(250,250);
        frame.setVisible(true);
    }

    private void go1() {
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
