package com.v_stepanov.some_lines_of_code.headFirsJava.chapter15_networkingAndThreads.threads;

/**
 * Created by User on 21.09.2017.
 */
class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw (int amount) {
        balance = balance - amount;
    }
}

public class RyanAnfMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAnfMonicaJob theJob = new RyanAnfMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about going ot sleep");
            System.out.println(Thread.currentThread().getName() + " is going to sleep");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");

        }
        else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}
