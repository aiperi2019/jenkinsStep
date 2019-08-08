package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.text.StyleContext;

public class SmartBearPage {

   public SmartBearPage(){

       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement username;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement password;
   @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;
   @FindBy(xpath = "(//ul[@id='ctl00_menu']//a)[3]")
    public WebElement orderButton;
   @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement product;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerNAme;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zip;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNumber;
   @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expire;
   @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement process;
   @FindBy(xpath = "//a[@href=\"Default.aspx\"]")
    public WebElement vieworderButton;


}
