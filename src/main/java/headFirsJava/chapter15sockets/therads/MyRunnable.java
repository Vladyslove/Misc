package headFirsJava.chapter15sockets.therads;

/**
 * Created by User on 21.09.2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
