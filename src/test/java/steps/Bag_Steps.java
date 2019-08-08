package steps;

import cucumber.api.java.en.Then;
import utilities.Driver;

public class Bag_Steps {
    @Then("User searches for bag")
    public void user_searches_for_bag() {
        Driver.getDriver().get("http://google.com");

    }

}
