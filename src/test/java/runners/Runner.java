package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)

    //telling to run with cucumber
    @CucumberOptions(

            plugin = {"html:target/cucumber","json:target/report.json"},
            features = "src/test/resources/features",
            //path of feature
            glue = "steps",
            tags ="@etsy",
            dryRun = false

    )
    public class Runner {



}
