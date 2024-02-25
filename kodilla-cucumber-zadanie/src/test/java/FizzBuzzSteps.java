import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {private int number;
    private String actualOutput;

    @Given("a number {int}")
    public void a_number(int num) {
        this.number = num;
    }

    @When("I play the FizzBuzz game")
    public void i_play_the_fizzbuzz_game() {
        // Implement FizzBuzz logic here
        if (number % 3 == 0 && number % 5 == 0) {
            actualOutput = "FizzBuzz";
        } else if (number % 3 == 0) {
            actualOutput = "Fizz";
        } else if (number % 5 == 0) {
            actualOutput = "Buzz";
        } else {
            actualOutput = "None";
        }
    }

    @Then("the output should be {string}")
    public void the_output_should_be(String expectedOutput) {
        assertEquals(expectedOutput, actualOutput);
    }
}