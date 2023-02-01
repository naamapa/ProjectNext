package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    //find element first product
    private By firstProductLocator = By.xpath("//*[@id=\"platform_modernisation_product_summary_M87060\"]/div/div[1]/div[1]/div/div/div[1]/a/img");


    public SearchPage (WebDriver driver){
        this.driver = driver;
    }

//first product click
    public void firstProductClick(){
        driver.findElement(firstProductLocator).click();
    }
}
