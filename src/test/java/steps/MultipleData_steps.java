package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class MultipleData_steps {

    @Given("User goes to Amazon website")
    public void user_goes_to_Amazon_website() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("User verifies following search departments")
    public void user_verifies_following_search_departments(List<String> options) {
        System.out.println(options);
    }
    @Given("Compare the given search departments to the existing")
    public void compare_the_given_search_departments_to_the_existing() {

        Select el = new Select(Driver.getDriver().findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']/select")));
        List <WebElement> d = el.getOptions();

        for(int i = 0; i < d.size(); i++){

            String e = d.get(i).getText();
            System.out.println(e);
        }


    }


    @Then("User closes the amazon")
    public void user_closes_the_amazon() {


    }
}
