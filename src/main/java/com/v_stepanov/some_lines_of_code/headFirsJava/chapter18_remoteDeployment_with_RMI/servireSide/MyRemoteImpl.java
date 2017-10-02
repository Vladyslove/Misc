package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.servireSide;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    @Override
    public String sayHello() {
        return null;
    }

    public MyRemoteImpl() throws RemoteException {
    }
}
