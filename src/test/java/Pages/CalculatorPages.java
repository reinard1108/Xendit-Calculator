package Pages;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CalculatorPages extends PageObject {
    WebDriver driver;
    public void openChromeBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.online-calculator.com/full-screen-calculator/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Thread.sleep(3000);
    }

    public void enterValues(DataTable dt){
        List<Map<String,String>> data = dt.asMaps(String.class,String.class);
        Actions actions = new Actions(driver);
        actions.sendKeys(data.get(0).get("value1")).perform();
        actions.sendKeys(data.get(0).get("operator")).perform();
        actions.sendKeys(data.get(0).get("value2")).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }
}
