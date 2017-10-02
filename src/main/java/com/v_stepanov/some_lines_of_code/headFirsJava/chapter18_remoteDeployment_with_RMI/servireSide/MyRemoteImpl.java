package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.servireSide;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    @Override
    public String sayHello() {
        return null;
    }

    public MyRemoteImpl() throws RemoteException {
    };

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
