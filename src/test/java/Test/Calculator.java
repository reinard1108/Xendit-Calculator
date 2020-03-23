package Test;

import cucumber.api.java.ca.Cal;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Steps.CalculatorSteps;

import java.util.List;
import java.util.Map;

public class Calculator {
    @Steps
    CalculatorSteps calculatorSteps;

    @Given("Open chrome browser and start application")
    public void openChromeBrowser() throws InterruptedException {
        calculatorSteps.openChromeBrowser();
    }

    @When("^I enter following values and press CE button$")
    public void enterValues(DataTable dt){
        calculatorSteps.enterValues(dt);

    }

    @Then("^I should be able to see$")
    public void result(DataTable dt){

    }
}
