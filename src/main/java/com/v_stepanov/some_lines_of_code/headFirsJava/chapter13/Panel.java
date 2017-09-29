package com.v_stepanov.some_lines_of_code.headFirsJava.chapter13;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 13.09.2017.
 */
public class Panel {
    public static void main(String[] args) {
        Panel gui = new Panel();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

}
