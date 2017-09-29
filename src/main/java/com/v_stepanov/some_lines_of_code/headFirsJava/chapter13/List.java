package com.v_stepanov.some_lines_of_code.headFirsJava.chapter13;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by User on 14.09.2017.
 */
public class List implements ListSelectionListener {
    JList jList;

    public static void main(String[] args) {
        List gui = new List();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        String [] listEntries = {"alpha" , "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        jList = new JList(listEntries);
        jList.addListSelectionListener(this);
        jList.setDragEnabled(true);

        jList.setVisibleRowCount(4);

        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scroller = new JScrollPane(jList);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.CENTER, jList);

        frame.setSize(350,305);
        frame.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selection = (String) jList.getSelectedValue();
            System.out.println(selection);
        }
    }
}
