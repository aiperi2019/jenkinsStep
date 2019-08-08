package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PingPongPage;
import utilities.Driver;
import javax.swing.*;

public class PingPong {


    PingPongPage pingPongPage = new PingPongPage();
    @Given("User is in Home Page")
    public void user_is_in_Home_Page() {
        Driver.getDriver().get("https://mariwka94.wixsite.com/thunderphoenix");
    }
    @When("User clicks on Register Ping Pong button")
    public void user_clicks_on_Register_Ping_Pong_button() {
        pingPongPage.PingPongButton.click();
    }
    @Then("User should be able click on Buy Ticket button")
    public void user_should_be_able_click_on_Buy_Ticket_button() throws InterruptedException{
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeAsyncScript("window.scroll(0,500);");

    }
    @When("User enters quantity for tickets")
    public void user_enters_quantity_for_tickets() throws InterruptedException{
        Thread.sleep(2000);
        pingPongPage.quantityButton.click();
    }
    @When("User clicks checkout")
    public void user_clicks_checkout() {

    }
    @Then("User is on  Add Your Deatails page")
    public void user_is_on_Add_Your_Deatails_page() {
    }
    @When("User fill up details information")
    public void user_fill_up_details_information() {
    }
    @When("User click continue")
    public void user_click_continue() {
    }
    @Then("User should be on Thank you page")
    public void user_should_be_on_Thank_you_page() {
    }
    @When("User clicks Add to Calendar")
    public void user_clicks_Add_to_Calendar() {
    }
    @When("User selects email")
    public void user_selects_email() {
    }
    @Then("User should be on Calendar page")
    public void user_should_be_on_Calendar_page() {
    }
    @Then("User should be able to modify suitable dates and time")
    public void user_should_be_able_to_modify_suitable_dates_and_time() {
    }
    @Then("User should be able invite existing quests")
    public void user_should_be_able_invite_existing_quests() {
    }
    @When("User should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
    }
    @Then("User should be able to see and click send button on Pop Up window")
    public void user_should_be_able_to_see_and_click_send_button_on_Pop_Up_window() {
    }
    @Then("User should be able to see event save Pop Up window")
    public void user_should_be_able_to_see_event_save_Pop_Up_window() {
    }
}
