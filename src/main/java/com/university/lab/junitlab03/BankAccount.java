package com.university.lab.junitlab03;

public class BankAccount {
    private double balance;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException();
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException();
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}