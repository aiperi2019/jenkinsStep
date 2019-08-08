package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class WikipediaSearchFunctionality{

    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();

    @Given("User is on wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }
    @When("User types {string} and look for it")
    public void user_types_and_look_for_it(String word) {
     wikipediaHomePage.searchBox.sendKeys(word);
    }
    @When("User clicks searching button")
    public void user_clicks_searching_button() {
        wikipediaHomePage.searchButton.click();

    }
    @Then("User sees {string} is appear as title")
    public void user_sees_is_appear_as_title(String word) {

        String actualName = Driver.getDriver().getTitle();
        String expectedName = word;

        Assert.assertTrue(actualName.contains(expectedName));
    }

    @Given("User is on wikipedia page")
    public void user_is_on_wikipedia_page() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }

    @When("User look for {string}")
    public void user_look_for(String string) {
       wikipediaHomePage.searchBox.sendKeys(string);
    }

    @When("User will clicks search button")
    public void user_will_clicks_search_button() {
        wikipediaHomePage.searchButton.click();
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {

        String expectedHeader = mainHeader;

        String  actualHeader = wikipediaHomePage.mainHeader.getText();

        System.out.println("Actual"+actualHeader);

      Assert.assertEquals(expectedHeader,actualHeader);
    }
}
