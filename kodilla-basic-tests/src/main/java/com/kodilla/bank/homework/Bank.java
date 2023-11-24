package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines = new CashMachine[0];
    private int size;

    public void registerCashMachine(CashMachine cashMachine) {
        CashMachine[] copy = new CashMachine[size + 1];
        System.arraycopy(cashMachines, 0, copy, 0, cashMachines.length);
        cashMachines = copy;
        cashMachines[size] = cashMachine;
        size ++;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (int k = 0; k < size; k++) {
            totalBalance += cashMachines[k].getBalance();
        }
        return totalBalance;
    }

    public int numerOfWithdrawals() {
        int sum = 0;
        for (int k = 0; k < size; k++) {
            sum += cashMachines[k].numberOfWithdrawals();
        }
        return sum;
    }

    public int numerOfDeposits() {
        int sum = 0;
        for (int k = 0; k < size; k++) {
            sum += cashMachines[k].numberOfDeposits();
        }
        return sum;
    }
    public double averageDeposit(){
        double sum = 0;
        for (int k = 0; k< size; k++){
            sum += cashMachines[k].averageDeposit();
        }
        return sum / size;
    }
    public double averageWithdrawal(){
        double sum = 0;
        for (int k = 0; k< size; k++){
            sum += cashMachines[k].averageWithdrawal();
        }
        return sum / size;
    }
}