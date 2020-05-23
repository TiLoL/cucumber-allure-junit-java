import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
/*
@CucumberOptions(features = {"src/test/resources"},
        plugin = {"pretty", "html:target/allure-results", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "json:target/allure-results/cucumber.json"}, monochrome = true, glue = {"definitions"})
*/
public class RunCucumberTest {
}