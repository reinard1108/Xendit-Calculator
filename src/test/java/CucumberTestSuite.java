import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features",
        tags = {"@Test"}
//        features = "/Users/setiobudi/Documents/Work/kraken2-test/src/test/resources/features/Fugu/Partner/Transaction/PlnPrepaidTransaction.feature"
)

public class CucumberTestSuite {
}
