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
import pages.LoginPage;

import java.time.Duration;

public class HeaderSectionTest {
    public WebDriver driver;
    public WebDriverWait wait;

    HomePage homePage;
    LoginPage loginPage;


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
    public void headerSectionUi(){
        // Test whether the Website logo is displayed
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("website-logo")));
        driver.findElement(By.className("website-logo")).isDisplayed();

        // Test the Navbar elements
        driver.findElement(By.linkText("Home")).isDisplayed();
        driver.findElement(By.linkText("Popular")).isDisplayed();

    }

    @Test(priority = 2)
    public void headerSectionFunctionalities(){
        //Test the navigation to Home and Popular pages through elements in header section
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Home']")));
        //driver.findElement(By.xpath("//a[text() = 'Home']")).click();
        driver.findElement(By.xpath("//a[text() = 'Home']")).isDisplayed();


        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Popular']")));
        //driver.findElement(By.xpath("//text() = 'Popular']")).click();
        driver.findElement(By.xpath("//a[text() = 'Popular']")).isDisplayed();

        //Test the navigation to account page through elements in header section
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar-button")));
        //driver.findElement(By.className("avatar-button")).click();
        driver.findElement(By.className("avatar-button")).isDisplayed();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

