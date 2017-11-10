package com.v_stepanov.some_lines_of_code.headFirsJava.chapter15_networkingAndThreads.threads;

/**
 * Created by User on 21.09.2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
