import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

import java.time.Duration;

public class LoginPageTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhara\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");
    }

    @Test(priority = 1)
    public void testLoginPageUI(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login-website-logo")));
        Assert.assertTrue(loginPage.isLogoDisplayed());


        Assert.assertEquals(loginPage.getHeadingText(), "Login");
        Assert.assertEquals(loginPage.getUsernameLabel(), "USERNAME");
        Assert.assertEquals(loginPage.getPasswordLabel(), "PASSWORD");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());

    }

    @Test(priority = 2)
    public void testLoginFunctionalities(){

        //Test login with empty input fields
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorMesssage(), "*Username or password is invalid");

        //Test login with empty username
        loginPage.login("", "password");
        Assert.assertEquals(loginPage.getErrorMesssage(), "*Username or password is invalid");

        //Test login with empty password
        loginPage.login("username", "");
        Assert.assertEquals(loginPage.getErrorMesssage(), "*Username or password is invalid");

        //Test login with invalid credentials
        loginPage.login("correctUsername", "wrongPassword");
        Assert.assertEquals(loginPage.getErrorMesssage(), "*invalid username");

        //Test with valid credentials
        loginPage.login("rahul", "rahul@2021");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}