package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

//find element my account
    private By myAccountLocator = By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[4]/div[2]/div/a/span");
// find element living room
    private By livingRoomLocator = By.linkText("Living Room");

//find element garden category
    private By gardenCategoryLocator = By.xpath("//*[@id=\"buttonlist1\"]/div/div[2]/div/div/div[2]");

 //find element baby category boner
    private By babyBonerLocator = By.xpath("//*[@id=\"snail-trail-container\"]/li[3]");

//find element change counter
    private By changeCountryLocator = By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[9]/button/img");

//find element hebrew language button
    private By hebrewLanguageLocator = By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[10]/div/div[3]/div/div[4]/div/button[1]");

//find element shop now button
    private By shopNowLocator = By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[10]/div/div[3]/div/div[5]/button");

//find element search box
    private By searchBoxLocator = By.id("header-big-screen-search-box");

//find element search button
    private By searchButtonLocator = By.xpath("//*[@id=\"header-search-form\"]/button");



    public HomePage (WebDriver driver){
        this.driver = driver;
    }
// my account click
    public void clickMyAccount(){
        driver.findElement(myAccountLocator).click();
    }

// living room click
    public void clickLivingRoom(){
        driver.findElement(livingRoomLocator).click();
    }

 //garden category click
    public void clickGardenCategory() {
        driver.findElement(gardenCategoryLocator).click();
    }

//baby category boner click
    public void clickBabyBoner(){
        WebElement doubleClickElement = driver.findElement(babyBonerLocator);
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickElement);
        action.perform();
    }

//change country click
    public void clickChangeCountry(){
        driver.findElement(changeCountryLocator).click();
    }

//hebrew language button click
    public void clickHebrewLanguage(){
        driver.findElement(hebrewLanguageLocator).click();
    }

//shop now button click
    public void clickShopNow(){
        driver.findElement(shopNowLocator).click();
    }

//search box send keys
    public void searchBoxSendKeys(String productSearch ){
        driver.findElement(searchBoxLocator).sendKeys(productSearch);
    }

//search button click
    public void searchButtonClick(){
        driver.findElement(searchButtonLocator).click();
    }

}
