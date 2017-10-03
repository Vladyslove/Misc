package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.servireSide;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by User on 02.10.2017.
 */

public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
