package Pages;

import TestCase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

//find element input email
    private By inputEmailLocator = By.id("EmailOrAccountNumber");

//find element input password
    private By inputPasswordLocator = By.id("Password");

//find element login button
    private By loginLocator = By.id("SignInNow");

    public LoginPage(WebDriver driver){
      this.driver = driver;
  }

//enter email
    public void enterEmail (String email){
        driver.findElement(inputEmailLocator).sendKeys(email);
    }

//enter password
    public void enterPassword(String password){
        driver.findElement(inputPasswordLocator).sendKeys(password);
    }

 // login click
    public void clickLogin(){
       driver.findElement(loginLocator).click();
    }
}
