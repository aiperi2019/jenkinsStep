package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import javax.swing.*;

public class Pen_Steps {

    @When("User in on Pen application")
    public void user_in_on_Pen_application() {
        Driver.getDriver().get("https://google.com");
    }

    @Then("User should see Pen title")
    public void user_should_see_Pen_title() {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("book"+ Keys.ENTER);
    }

    @Then("User searches for book")
    public void user_searches_for_book() {
        String actualHeader = Driver.getDriver().getTitle();
        String expectedInTitle = "book";

        Assert.assertTrue(actualHeader.contains(expectedInTitle));

    }

    @Then("User delete book")
    public void user_delete_book() {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.clear();
    }

    @Then("User search for phone")
    public void user_search_for_phone() {

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("phone"+ Keys.ENTER);

        String actualHeader = Driver.getDriver().getTitle();
        String expectedInTitle = "phone";

        Assert.assertTrue(actualHeader.contains(expectedInTitle));
    }

}
