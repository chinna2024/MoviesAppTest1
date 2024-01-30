import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;
import java.util.List;

public class HomePageTest {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
        driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
        driver.findElement(By.className("login-button")).submit();
    }

    @Test(priority = 1)
    public void HomePage(){
        // Test the heading texts of each section
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movies-list-heading")));
        Assert.assertEquals(homePage.getHeadingText(), "Trending Now");

        // Test whether the play button is displayed or not
        Assert.assertTrue(homePage.getPlayButton());


        //Test the Contact Us Section
        Assert.assertEquals(homePage.getContactUsSection(), "Contact Us");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
