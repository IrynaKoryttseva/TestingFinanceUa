package jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.StepsLogic;


public class TestCheckValueFinancePortal {

    @Steps
    StepsLogic stepsLogic;

    @Given("the user goes on the Finance.i.ua main page and click link EUR")
    public void OpenMainPage() {
        stepsLogic.goesOnStartPage();
    }

    @When("the user check logic calculator")
    public void checkLogicCalculatorAverageForBuying() {
    }

    @Then("the user should see the correct result min value for buying")
    public void checkCorrectResultMinForBuying() {
        stepsLogic.checkMinRateForBuying();
    }

    @Then("the user should see the correct result min value for selling")
    public void checkCorrectResultMinForSelling() {
        stepsLogic.checkMinRayeForSelling();
    }

    @Then("the user should see the correct result max value for buying")
    public void checkCorrectResultMaxBuying() {
        stepsLogic.checkMaxRateForBuying();
    }

    @Then("the user should see the correct result max value for selling")
    public void checkCorrectResultMaxSelling() {
        stepsLogic.checkMaxRateForSelling();
    }

    @Then("the user should see the correct result average value for buying")
    public void checkCorrectResultAverageBuying() {
        stepsLogic.checkAverageForBuying();
    }

    @Then("the user should see the correct result average value for selling")
    public void checkCorrectResultAverageSelling() {
        stepsLogic.checkAverageForSelling();
    }

    @Then("the user should see the correct result optimal value for buying")
    public void checkCorrectResultOptimalBuying() {
        stepsLogic.checkOptimalForBuying();
    }

    @Then("the user should see the correct result optimal value for selling")
    public void checkCorrectResultOptimalSelling() {
        stepsLogic.checkOptimalForSelling();
    }
}



