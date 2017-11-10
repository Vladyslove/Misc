package com.v_stepanov.some_lines_of_code.headFirsJava.chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 07.09.2017.
 */
public class SimpleGUI implements ActionListener{
    JButton button;
    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
