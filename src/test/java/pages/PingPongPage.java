package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PingPongPage {

    public PingPongPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//button[@class='_1Ramb a11yOutline  _21iD2 _15fuf _1sBKq _1d2Gg'])[3]")
    public WebElement PingPongButton;

    @FindBy(xpath = "//div[@class=\"_22uyp\"]//button")
    public WebElement buyTicketButton;

    @FindBy(xpath = "//div[@role='row']//button[2]")
    public WebElement quantityButton;


}

