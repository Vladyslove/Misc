package headFirsJava.chapter13;

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

        JButton button = new JButton("shock me");

        panel.add(button);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

}
