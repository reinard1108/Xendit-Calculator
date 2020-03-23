package Steps;

import Pages.CalculatorPages;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorSteps {
    CalculatorPages calculatorPages;

    @Step
    public void openChromeBrowser() throws InterruptedException {
        calculatorPages.openChromeBrowser();

    }

    @Step
    public void enterValues(DataTable dt){
        calculatorPages.enterValues(dt);
    }
}
