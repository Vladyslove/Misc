package com.v_stepanov.some_lines_of_code.headFirsJava.chapter18_remoteDeployment_with_RMI.clientServerAppWithRMI

import java.net.MalformedURLException
import java.rmi.Naming
import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject
import java.util.HashMap

/**
 * Created by User on 04.10.2017.
 */
class ServiceServerImpl @Throws(RemoteException::class)
constructor() : UnicastRemoteObject(), ServiceServer {
    internal var serviceList: HashMap<*, *>

    init {
        setUpServices()
    }

    private fun setUpServices() {
        serviceList = HashMap()
        serviceList.put("Dice Rolling Service", DiceService())
        serviceList.put("Day of the Week Service", DayOfTheWeekService())
        serviceList.put("Vusual Music Servie", MiniMusicService())
    }

    @Throws(RemoteException::class)
    override fun getServiceList(): Array<Any> {
        println("in remote")
        return serviceList.keys.toTypedArray()

    }

    @Throws(RemoteException::class)
    override fun getService(serviceKey: Any): Service {
        val theService = serviceList.get(serviceKey) as Service
        return theService
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {
            try {
                Naming.rebind("ServiceServer", ServiceServerImpl())
            } catch (e: RemoteException) {
                e.printStackTrace()
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }

            println("Remote service is running")
        }
    }


}
