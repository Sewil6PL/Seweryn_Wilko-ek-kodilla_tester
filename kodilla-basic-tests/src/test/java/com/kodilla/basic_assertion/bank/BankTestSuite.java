package com.kodilla.basic_assertion.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {
    @Test
    void shouldCalculateAverageDeposit(){
        //given
        CashMachine c1 = new CashMachine();
        c1.deposit(20);
        c1.deposit(60);
        CashMachine c2 = new CashMachine();
        c2.deposit(80);
        c2.deposit(40);
        Bank bank = new Bank();
        bank.registerCashMachine(c1);
        bank.registerCashMachine(c2);
        //when
        double result = bank.averageDeposit();
        //then
        assertEquals(50, result, 0.001);
    }
}
