package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private WebDriver driver;

    //find element ways to pay
    private By waysToPayLocator = By.xpath("//*[@id=\"ct\"]/div[4]/form/div[3]/ul/li[3]/div");

    //find element card number
    private By cardNumberLocator = By.id("cardNumber");

    //find element month
    private By monthLocator = By.id("expiryMonth");

    //find element year
    private By yearLocator = By.id("expiryYear");

    //find element security code
    private By securityCodeLocator = By.xpath("//*[@id=\"securityCode\"]");

    //find element pay now
    private By payNowLocator = By.id("submitButton");

    //find element cardNumber message
    private By cardNumberMessageLocator = By.id("cardNumber message");



    public PaymentPage (WebDriver driver) {
        this.driver = driver;
    }

    //ways to pay click
    public void waysToPayClick(){
      driver.findElement(waysToPayLocator).click();
    }

    //enter card number
    public void enterCardNumber(String cardNumber){
        driver.findElement(cardNumberLocator).sendKeys(cardNumber);
    }

    //enter expiry month
    public void enterMonth(String month){
        driver.findElement(monthLocator).sendKeys(month);
    }

    //enter expiry year
    public void enterYear(String year){
        driver.findElement(yearLocator).sendKeys(year);
    }

    //enter security code
    public void enterSecurityCode(String securityCode){
        driver.findElement(securityCodeLocator).sendKeys(securityCode);
    }

    //pay now button click
    public void payNowClick(){
        driver.findElement(payNowLocator).click();
    }

   //get text cardNumber message
    public String cardNumberGetText(){
        driver.findElement(cardNumberLocator).getText();
        return null;
    }

}
