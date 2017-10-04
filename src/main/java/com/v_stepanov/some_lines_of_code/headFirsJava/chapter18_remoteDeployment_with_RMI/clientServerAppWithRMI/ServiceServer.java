package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.clientServerAppWithRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by User on 04.10.2017.
 */
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}
