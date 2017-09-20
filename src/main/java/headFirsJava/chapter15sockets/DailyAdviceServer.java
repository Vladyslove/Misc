package headFirsJava.chapter15sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by User on 20.09.2017.
 */
public class DailyAdviceServer {

    String [] adviseList = {"Advice 1", "Advice 2","Advice 3","Advice 4","Advice 5",};

    public void go() {

        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while (true) {

                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviseList.length);
        return adviseList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
