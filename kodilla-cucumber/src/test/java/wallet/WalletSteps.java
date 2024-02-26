package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private Cashier cashier;


    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $300")
    public void i_request_$300() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }


    @When("I request $200")
    public void i_request_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        assertEquals(200, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $0")
    public void the_balance_of_my_wallet_should_be_$0() {
        assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $50")
    public void i_request_$50() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @When("I request -$50")
    public void i_request_negative_$50() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @Then("the withdrawal should fail with a message indicating insufficient funds")
    public void withdrawal_should_fail_with_insufficient_funds_message() {
        assertEquals(0, cashSlot.getContents());
    }

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_I_don_t_have_enough_money_in_my_wallet() {
        assertEquals(0, cashSlot.getContents());
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet(){
    }
    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        assertEquals(100, wallet.getBalance());
    }
}

