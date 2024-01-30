import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountPageTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
        driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
        driver.findElement(By.className("login-button")).submit();
    }

    @Test(priority = 1)
    public void accountPageTest(){
        //Test all the UI elements present on the web page.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar-button")));
        driver.findElement(By.className("avatar-button")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("account-heading")));
        driver.findElement(By.className("account-heading")).isDisplayed();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("membership-heading")));
        driver.findElement(By.className("membership-heading")).isDisplayed();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("membership-username")));
        driver.findElement(By.className("membership-username")).isDisplayed();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.className("membership-password")));
        driver.findElement(By.className("membership-password")).isDisplayed();

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text() = 'Plan details']")));
        driver.findElement(By.xpath("//p[text() = 'Plan details']")).isDisplayed();

        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.className("plan-paragraph")));
        driver.findElement(By.className("plan-paragraph")).isDisplayed();

        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.className("plan-details")));
        driver.findElement(By.className("plan-details")).isDisplayed();

        //Test the Logout functionality
        driver.findElement(By.className("logout-button")).click();
        String expectedUrl = "https://qamoviesapp.ccbp.tech/login";
        WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait8.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Urls are not matching...");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
