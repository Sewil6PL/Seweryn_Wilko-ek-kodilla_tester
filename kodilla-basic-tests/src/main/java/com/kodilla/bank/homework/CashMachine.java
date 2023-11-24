package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {
    private double[] transactions;
    private int transactionCount;

    public CashMachine() {
        transactions = new double[0];
        transactionCount = 0;
    }

    public void deposit(double amount) {
        double[] copy = new double[transactionCount + 1];
        System.arraycopy(transactions, 0, copy, 0, transactions.length);
        transactions = copy;
        transactions[transactionCount] = amount;
        transactionCount++;
    }

    public void withdraw(double amount) {
        double[] copy = new double[transactionCount + 1];
        System.arraycopy(transactions, 0, copy, 0, transactions.length);
        transactions = copy;
        transactions[transactionCount] = -amount;
        transactionCount++;
    }


    public double getBalance() {
        double sum = 0;
        for (int k = 0; k < transactionCount; k++)
            sum += transactions[k];
        return sum;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public int numberOfDeposits() {
        int sum = 0;
        for (int k = 0; k < transactionCount; k++) {
            if (transactions[k] > 0) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithdrawals() {
        int sum = 0;
        for (int k = 0; k < transactionCount; k++) {
            if (transactions[k] < 0) {
                sum++;
            }
        }
        return sum;
    }

    public double averageDeposit() {
        double sum = 0;
        int count = 0;
        for (int k = 0; k < transactionCount; k++) {
            if (transactions[k] > 0) {
                count++;
                sum += transactions[k];
            }
        }
        return sum / count;
    }

    public double averageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (int k = 0; k < transactionCount; k++) {
            if (transactions[k] < 0) {
                count++;
                sum += transactions[k];
            }
        }
        return sum / count;
    }
}

