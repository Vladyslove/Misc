package headFirsJava.chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by User on 14.09.2017.
 */
public class CheckBox implements ItemListener {
    JCheckBox jCheckBox;

    public static void main(String[] args) {
        CheckBox gui = new CheckBox();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JCheckBox jCheckBox = new JCheckBox("goes to 11");

        jCheckBox.addItemListener(this);

        frame.getContentPane().add(BorderLayout.SOUTH, jCheckBox);

        frame.setSize(350,305);
        frame.setVisible(true);

        jCheckBox.setSelected(true);
        jCheckBox.setSelected(false);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (jCheckBox.isSelected()) onOrOff = "on";
        System.out.println("Check box is: " + onOrOff);
    }
}
