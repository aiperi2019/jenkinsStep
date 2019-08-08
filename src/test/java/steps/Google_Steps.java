package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Google_Steps {

    @When("User in Google search page")
    public void user_in_Google_search_page() {
        Driver.getDriver().get("https://google.com");
    }

    @Then("User searches for apples")
    public void user_searches_for_apples() {
       WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
       searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("User should see apples inside of the title")
    public void user_should_see_apples_inside_of_the_title() {
        String actualHeader = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";
        Assert.assertTrue(actualHeader.contains(expectedInTitle));

        Driver.getDriver().quit();
    }

    @Then("User goes to amazon website")
    public void user_goes_to_amazon_website() {

    }

    @When("User searches for a word {string}")
    public void user_searches_for_a_word(String word) {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(word + Keys.ENTER);
    }

    @Then("user should see a word {string} inside of the title")
    public void user_should_see_a_word_inside_of_the_title(String word) {

        String actualHeader = Driver.getDriver().getTitle();
        String expectedInTitle = word;
        Assert.assertTrue(actualHeader.contains(expectedInTitle));

        Driver.getDriver().quit();
    }
    @Given("User tests with words {string} {string} {string}")
    public void user_tests_with_words(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User checks the numbers and {int} and {int}")
    public void user_checks_the_numbers_and_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
