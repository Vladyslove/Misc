package com.v_stepanov.some_lines_of_code.headFirsJava.chapter15_networkingAndThreads.threads;

/**
 * Created by User on 22.09.2017.
 */

class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            increment();
            System.out.println("balance is " + balance);

        }
    }

    private synchronized void increment() {
        int i = balance;
        balance = i + 1;
    }
}

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}
