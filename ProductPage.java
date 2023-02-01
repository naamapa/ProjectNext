package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    private WebDriver driver;


    //find element combo box dress color
    private By comboBoxColorLocator = By.id("dk_container_Colour-915273");

    //find element list dress color 01
    private By dressColorLocator_1 = By.linkText("קשת בצבע ירוק מנטה");

    //find element list dress color 02
    private By dressColorLocator_2 = By.linkText("צהוב עם קשתות");

    //find element combo box dress size 01
    private By comboBoxSizeLocator_1 = By.id("dk_container_Size-M87-055");

    //find element combo box dress size
    private By comboBoxSizeLocator_2 = By.id("dk_container_Size-U80-776");

    //find element list dress size 01
    private By dressSizeLocator_1 = By.linkText("9-12 חודשים (UK ) (מידה אירופית 74-80ס״מ) - 42 ₪");

    //find element list dress size 02
    private By dressSizeLocator_2 = By.linkText("3-4 שנים (UK ) (מידה אירופית 98-104ס״מ) - 50 ₪");

    //find element add to bag
    private By addToBagLocator = By.xpath("//*[@id=\"Style915273\"]/section/div[4]/div[19]/div[4]/div/a[1]");

    //find element shopping bag
    private By shoppingBagLocator = By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[7]/div[2]/div");

    //find element Cash register
    private By CashRegisterLocator = By.linkText("לקופה");


    public ProductPage (WebDriver driver) {
        this.driver = driver;
    }

 //combo box color click
    public void comboBoxColorClick (){
        driver.findElement(comboBoxColorLocator).click();
    }

//to choose dress color on from a list for product 1
    public void chooseColorDrees_1(){
        driver.findElement(dressColorLocator_1).click();

    }

    //combo box size click 01
    public void comboBoxSizeClick_1 (){
        driver.findElement(comboBoxSizeLocator_1).click();
    }

    //to choose dress size on from a list for product 1
    public void chooseSizeDrees_1(){
       driver.findElement(dressSizeLocator_1).click();
    }

    //add to bag click
    public void addToBagClick(){
        driver.findElement(addToBagLocator).click();
    }

    //to choose dress color on from a list for product 2
    public void chooseColorDrees_2(){
        driver.findElement(dressColorLocator_2).click();
    }

    //combo box size click 02
    public void comboBoxSizeClick_2 (){
        driver.findElement(comboBoxSizeLocator_2).click();
    }

    //to choose dress size on from a list for product 2
    public void chooseSizeDrees_2(){
        driver.findElement(dressSizeLocator_2).click();
    }

    //shopping bag button click
    public void shoppingBagClick(){
        driver.findElement(shoppingBagLocator).click();
    }

    //cash register button click
    public void cashRegisterClick(){
        driver.findElement(CashRegisterLocator).click();
    }
}
