package steps;
import java.sql.SQLOutput;
import java.util.List;

import cucumber.api.java.bs.I;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SmartBearPage;
import utilities.Config;
import utilities.Driver;

public class SmartBear_steps {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account")
    public void user_is_logged_into_SmartBear_Tester_account() {
        Driver.getDriver().get(Config.getProperty("smartURL"));
        smartBearPage.username.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.loginButton.click();

    }

    @When("Click on Order page")
    public void click_on_Order_page() {
    smartBearPage.orderButton.click();
    }

    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {

    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBearPage.product);
        select.selectByVisibleText(string);

    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantity.sendKeys(string);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerNAme.sendKeys(string);

    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
smartBearPage.street.sendKeys(string);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
smartBearPage.city.sendKeys(string);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
smartBearPage.state.sendKeys(string);
    }

    @When("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
smartBearPage.zip.sendKeys(string);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {

        List<WebElement> radioButton = Driver.getDriver().findElements(By.xpath("//ol[3]/li/table//input"));


        for(WebElement w : radioButton){
            System.out.println(w.getAttribute("value"));
            if(string.equals(w.getAttribute("value"))){
               w.click();
               break;
            }
        }

    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);

    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
smartBearPage.expire.sendKeys(string);
    }

    @When("User clicks process button")
    public void user_clicks_process_button()throws InterruptedException {
        smartBearPage.process.click();
        smartBearPage.vieworderButton.click();
        Thread.sleep(2000);

    }


    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) throws InterruptedException {

List<WebElement> names = Driver.getDriver().findElements(By.xpath("//table[@class='SampleTable']//tr//td[2]"));

for(WebElement n : names){
    if(n.getText().equals(string)) {
        System.out.println(n.getText());
        Assert.assertTrue(n.getText().equals(string));
    }
}
    }







}
