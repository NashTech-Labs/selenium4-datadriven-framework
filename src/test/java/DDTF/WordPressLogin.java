package DDTF;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import lib.ExcelDataConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class WordPressLogin {
    Config config = ConfigFactory.load("application.conf");
    String driverPath = config.getString("driverPath");
    WebDriver driver;  //Making WebDriver's global variable//
    @DataProvider(name = "wordpressData")   //Getting data from Excel sheet//
    public Object[][] passData() {
        ExcelDataConfig config = new ExcelDataConfig("src/test/resources/testdata.xlsx");
        int rows = config.getRowCount(0);
        Object[][] data = new Object[rows][2];
        for (int i = 0; i < rows; i++) {
            data[i][0] = config.getData(0, i, 0);
            data[i][1] = config.getData(0, i, 1);
        }
        return data;
    }
    @Test(dataProvider = "wordpressData")  //Taking data from dataProvider and putting in selenium test//
    public void loginToWordPress(String username, String password) throws InterruptedException {
        Reporter.log(username);
        Reporter.log(password);
        System.setProperty("webdriver.chrome.driver", driverPath);  //Providing path of chromedriver//
        driver = new ChromeDriver();  //Opening the chrome browser//
        driver.manage().window().maximize();  //Maximizing the browser//
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Putting implicit wait//
        driver.get("https://learner.demo.edunext.co/login?next=%2F");  //Opening dummy login website//
        driver.findElement(By.cssSelector("#login-email")).sendKeys(username);  //Locating login field//
        driver.findElement(By.cssSelector("#login-password")).sendKeys(password);  //Locating password field//
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();  //Locating sign in button//
        Thread.sleep(2000);
    }
    @AfterMethod  //This tearDown function quits the driver after test executed//
    public void tearDown() {
        driver.quit();
    }
}