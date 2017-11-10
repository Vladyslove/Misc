package com.v_stepanov.some_lines_of_code.headFirsJava.chapter15_networkingAndThreads.threads;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread betta = new Thread(runner);

        alpha.setName("Alpha thread");
        betta.setName("Betta thread");

        alpha.start();
        betta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "is running");
        }
    }
}
