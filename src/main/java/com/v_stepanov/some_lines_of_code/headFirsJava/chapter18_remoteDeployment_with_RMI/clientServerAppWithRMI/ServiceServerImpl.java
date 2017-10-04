package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.clientServerAppWithRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by User on 04.10.2017.
 */
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    public ServiceServerImpl() throws RemoteException {
    }

    @Override
    public Object[] getServiceList() throws RemoteException {
        return new Object[0];
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        return null;
    }
}
