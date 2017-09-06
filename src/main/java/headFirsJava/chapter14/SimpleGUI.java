package headFirsJava.chapter14;

import javax.swing.*;

/**
 * Created by User on 07.09.2017.
 */
public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(250,250);

        frame.setVisible(true);
    }
}
