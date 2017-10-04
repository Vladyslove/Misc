package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.clientServerAppWithRMI;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by User on 04.10.2017.
 */
public interface Service extends Serializable{
    JPanel getGuiPanel();
}
