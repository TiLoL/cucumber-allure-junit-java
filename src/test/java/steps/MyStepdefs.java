package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("I have a calculator")
    public void iHaveACalculator() {
    }

    @When("I sum two numbers {int} and {int}")
    public void iSumTwoNumbersNumAndNum(int arg0, int arg1) {

    }

    @Then("result is {long}")
    public void resultIsResult(long result) {
    }
}
