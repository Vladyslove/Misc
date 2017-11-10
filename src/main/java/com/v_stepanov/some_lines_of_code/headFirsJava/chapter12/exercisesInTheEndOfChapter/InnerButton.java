package com.v_stepanov.some_lines_of_code.headFirsJava.chapter12.exercisesInTheEndOfChapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 12.09.2017.
 */
public class InnerButton {
    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        b.addActionListener(new Blistener());

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200,100);
        frame.setVisible(true);
    }

    private class Blistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (b.getText().equals("A")) {
                b.setText("B");
            } else {
                b.setText("A");
            }
        }
    }
}
