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
//        gui.go1();
//        gui.go2();
        gui.go3();
    }

    private void go3() {
        JFrame frame = new JFrame();

        JTextField field = new JTextField(20);
        frame.getContentPane().add(field);
        System.out.println(field.getText());
        field.setText("anything");
        field.selectAll();
        field.requestFocus();

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void go2() {
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void go1() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click this");
        Font bigFont = new Font("serif", Font.BOLD, 35);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    private void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click like you mean it");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(250,250);
        frame.setVisible(true);
    }


}
