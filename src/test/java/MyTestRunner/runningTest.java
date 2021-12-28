package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//com//features//AccountsPage.feature"},
				 glue= {"stepDefinitions","AppHooks"},
				 dryRun = false,
				 monochrome = true,
				 plugin="pretty",
				 publish = true)

public class runningTest {

}
