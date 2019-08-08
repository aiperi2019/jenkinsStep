package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class MvnRepository_Steps {


    @When("User in mvn repository web site")
    public void user_in_mvn_repository_web_site() {
        Driver.getDriver().get("https://mvnrepository.com");
    }

    @When("User searches for cucumber java")
    public void user_searches_for_cucumber_java() {
        WebElement searchField = Driver.getDriver().findElement(By.xpath("//input[@class='textfield']"));
        searchField.sendKeys("cucumber java"+ Keys.ENTER);
    }

    @Then("User should see Cucumber JVM")
    public void user_should_see_Cucumber_JVM() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
