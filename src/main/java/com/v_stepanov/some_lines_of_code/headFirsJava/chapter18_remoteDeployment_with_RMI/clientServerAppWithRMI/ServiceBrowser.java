package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.clientServerAppWithRMI;

import javax.swing.*;
import java.awt.*;
import java.rmi.RemoteException;

/**
 * Created by User on 04.10.2017.
 */
public class ServiceBrowser {

    JPanel mainPanel;
    JComboBox serviceList;
    ServiceServer server;

    public void buildGUI() {
        JFrame frame = new JFrame("RMI Browser");
        mainPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        Object[] services = getServicesList();

        serviceList = new JComboBox(services);

        frame.getContentPane().add(BorderLayout.NORTH, serviceList);

        serviceList.addActionListener(new MyListener());

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    void loadService(Object serviceSelection) {
        try {
            Service svc = server.getService(serviceSelection);

            mainPanel.removeAll();
            mainPanel.add(svc.getGuiPanel());
            mainPanel.validate();
            mainPanel.repaint();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
