package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="AutomationScenarios",
        glue={"Stepdefinition"},
        tags="@datausingdatatableconcept"
        //plugin = {"pretty","html:target/at.html"}
       // plugin = {"pretty","html:target/htmlReports.html"}
        )
public class TestRunner 
{

}



