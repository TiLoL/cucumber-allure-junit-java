package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepdefs {

    @Given("I have a calculator")
    public void iHaveACalculator() {
        System.out.println("iHaveACalculator");
    }

    @When("I sum two numbers {int} and {int}")
    public void iSumTwoNumbersNumAndNum(int arg0, int arg1) {
        System.out.println("iSumTwoNumbersNumAndNum");
    }

    @Then("result is {long}")
    public void resultIsResult(long result) {
        System.out.println("resultIsResult");
    }
}
