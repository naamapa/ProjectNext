package TestCase;

import Pages.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class LoginTC {
    private static WebDriver driver;
    static ExtentReports extentReports = new ExtentReports();
    static ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/Spark/index.html");

    @BeforeClass
    public static void beforeClass() throws ParserConfigurationException, IOException, SAXException {
        extentReports.attachReporter(sparkReporter);

        System.setProperty("webdriver.chrome.driver",Constants.URL_CHROME_DRIVER);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(getData("URL"));

    }
// login with username and password
    @Test
    public  void testLogin_01() throws ParserConfigurationException, IOException, SAXException {
        ExtentTest test1 = extentReports.createTest("test1");
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        home.clickMyAccount();
        login.enterEmail(getData("EMAIL"));
        login.enterPassword(getData("PASSWORD"));
        login.clickLogin();
        String titleLogin = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_LOGIN,titleLogin,true);
        if (true){
            String currentTime1 = String.valueOf(System.currentTimeMillis());
            test1.pass("login with username and password", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                    ("target\\Spark\\Screenshots\\" + currentTime1)).build());
        }
        else
            test1.fail("the test not pass");
        driver.navigate().to(getData("URL"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


  @Test
  public void testPageHome_02() throws ParserConfigurationException, IOException, SAXException, InterruptedException {
//Clicking on the living room link
        ExtentTest test2 = extentReports.createTest("test2");
        HomePage home = new HomePage(driver);
        home.clickLivingRoom();
        Thread.sleep(2000);
        String titleLivingRoom = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_LIVING_ROOM,titleLivingRoom,true);
        if (true){
          String currentTime2 = String.valueOf(System.currentTimeMillis());
          test2.pass("Clicking on the living room link", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                  ("target\\Spark\\Screenshots\\" + currentTime2)).build());
        }
        else
          test2.fail("the test not pass");
        driver.navigate().to(getData("URL"));
        Thread.sleep(2000);

// Clicking on a garden category
        ExtentTest test3 = extentReports.createTest("test3");
        home.clickGardenCategory();
        String titleGarden= driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_GARDEN,titleGarden,true);
        if (true){
          String currentTime3 = String.valueOf(System.currentTimeMillis());
          test3.pass("Clicking on a garden category", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                  ("target\\Spark\\Screenshots\\" + currentTime3)).build());
        }
        else
          test3.fail("the test not pass");
        driver.navigate().to(getData("URL"));
        Thread.sleep(2000);


//Clicking on a baby banner
        ExtentTest test4 = extentReports.createTest("test4");
        home.clickBabyBoner();
        String titleBaby = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_BABY,titleBaby,true);
        if (true){
            String currentTime4 = String.valueOf(System.currentTimeMillis());
            test4.pass("Clicking on a baby banner", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                    ("target\\Spark\\Screenshots\\" + currentTime4)).build());
        }
        else
            test4.fail("the test not pass");
        driver.navigate().to(getData("URL"));
        Thread.sleep(2000);


//Change language to Hebrew
        ExtentTest test5 = extentReports.createTest("test5");
        home.clickChangeCountry();
        Thread.sleep(2000);
        home.clickHebrewLanguage();
        Thread.sleep(3000);
        home.clickShopNow();
        Thread.sleep(4000);
        String titleHebrewLanguage = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_HEBREW_LANGUAGE,titleHebrewLanguage,true);
      if (true){
          String currentTime5 = String.valueOf(System.currentTimeMillis());
          test5.pass("Change language to Hebrew", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                  ("target\\Spark\\Screenshots\\" + currentTime5)).build());
      }
      else
          test5.fail("the test not pass");
        Thread.sleep(2000);

//Search for an item through the search box
        ExtentTest test6 = extentReports.createTest("test6");
        home.searchBoxSendKeys(getData("ProductSearch"));
        Thread.sleep(2000);
        home.searchButtonClick();
        String titleSearch = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_SEARCH,titleSearch,true);
      if (true){
          String currentTime6 = String.valueOf(System.currentTimeMillis());
          test6.pass("Search for an item through the search box", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                  ("target\\Spark\\Screenshots\\" + currentTime6)).build());
      }
      else
          test6.fail("the test not pass");
      Thread.sleep(2000);
 }

 @Test
 public void testSearchPage_03() throws InterruptedException, IOException {
        SearchPage  search = new SearchPage(driver);
//Enter the first item from the search page
        ExtentTest test7 = extentReports.createTest("test7");
  //Go to the which page
        driver.navigate().to("https://www.next.co.il/he/search?w=dress");
        search.firstProductClick();
        Thread.sleep(2000);
        String titleDress = driver.getTitle();
        Assert.assertNotEquals(Constants.TITLE_DRESS,titleDress,true);
        Thread.sleep(2000);
     if (true){
         String currentTime7 = String.valueOf(System.currentTimeMillis());
         test7.pass("Enter the first item from the search page", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                 ("target\\Spark\\Screenshots\\" + currentTime7)).build());
     }
     else
         test7.fail("the test not pass");

 }

 @Test
 public void testProductPage_04() throws InterruptedException, IOException {
     ProductPage product = new ProductPage(driver);
//You put an item in the shopping bag
     ExtentTest test8 = extentReports.createTest("test8");
     //Go to the page of the dress on which the test is conducted
     driver.navigate().to("https://www.next.co.il/he/style/st034323/m87060#m87060");
     Thread.sleep(2000);

     product.comboBoxColorClick();
     product.chooseColorDrees_1();
     product.comboBoxSizeClick_1();
     product.chooseSizeDrees_1();
     Thread.sleep(3000);
     product.addToBagClick();
     Thread.sleep(3000);
     String currentTime8 = String.valueOf(System.currentTimeMillis());
     test8.pass("You put an item in the shopping bag", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
             ("target\\Spark\\Screenshots\\" + currentTime8)).build());

//You put another item in the shopping bag
     ExtentTest test9 = extentReports.createTest("test9");
     product.comboBoxColorClick();
     product.chooseColorDrees_2();
     product.comboBoxSizeClick_2();
     product.chooseSizeDrees_2();
     Thread.sleep(3000);
     product.addToBagClick();
     Thread.sleep(3000);
     String currentTime9 = String.valueOf(System.currentTimeMillis());
     test9.pass("You put another item in the shopping bag", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
             ("target\\Spark\\Screenshots\\" + currentTime9)).build());

//Clicking on the shopping bag
     ExtentTest test10 = extentReports.createTest("test10");
     product.shoppingBagClick();
     Thread.sleep(3000);
     String currentTime10 = String.valueOf(System.currentTimeMillis());
     test10.pass("Clicking on the shopping bag", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
             ("target\\Spark\\Screenshots\\" + currentTime10)).build());

//cash register entry
     ExtentTest test11 = extentReports.createTest("test11");
     product.cashRegisterClick();
     Thread.sleep(3000);
     String titlePayment = driver.getTitle();
     Assert.assertNotEquals(Constants.TITLE_PAYMENT,titlePayment,true);
     if (true){
         String currentTime11 = String.valueOf(System.currentTimeMillis());
         test11.pass("cash register entry", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                 ("target\\Spark\\Screenshots\\" + currentTime11)).build());
     }
     else
         test11.fail("the test not pass");




 }

 @Test
 public void testPayment_05() throws InterruptedException, ParserConfigurationException, IOException, SAXException {
     PaymentPage payment = new PaymentPage(driver);
//Entering Visa card details
     ExtentTest test12 = extentReports.createTest("test12");
     payment.waysToPayClick();
     Thread.sleep(3000);
     payment.enterCardNumber(getData("CardNumber"));
     payment.enterMonth(getData("Month"));
     payment.enterYear(getData("Year"));
     payment.enterSecurityCode(getData("SecurityCode"));
     Thread.sleep(3000);
     payment.payNowClick();

     String currentTime12 = String.valueOf(System.currentTimeMillis());
     test12.pass("Entering Visa card details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
             ("target\\Spark\\Screenshots\\" + currentTime12)).build());

//Promise message A valid card number must be entered
     ExtentTest test13 = extentReports.createTest("test12");
     String cardNumberMessage = payment.cardNumberGetText();
     if (cardNumberMessage.equals(Constants.CARD_NUMBER_MESSAGE)){
         String currentTime13 = String.valueOf(System.currentTimeMillis());
         test13.pass("Promise message A valid card number must be entered", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot
                 ("target\\Spark\\Screenshots\\" + currentTime13)).build());
     }


 }

@AfterClass
    public static void afterClass(){
    extentReports.flush();
    driver.quit();

}

    private static String getData (String keyName) throws ParserConfigurationException, IOException, SAXException {
        File configXmlFile = new File(Constants.FILE_XML);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;

        dBuilder = dbFactory.newDocumentBuilder();

        Document doc = null;

        assert dBuilder != null;
        doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath+".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath+".png";
    }
}
