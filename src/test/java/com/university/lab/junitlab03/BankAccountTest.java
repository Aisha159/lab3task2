package com.university.lab.junitlab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDepositPositive() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawValid() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalance() {
        BankAccount account = new BankAccount();
        account.deposit(50.0);
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(100.0);
        });
    }

    @Test
    public void testDepositNegative() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
    }
}