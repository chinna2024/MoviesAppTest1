import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchPageTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
        driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
        driver.findElement(By.className("login-button")).submit();
    }

    @Test
    public void searchFunctionality(){
        // Test the Search functionality by searching with some movie names and the count of movies displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-empty-button")));
        driver.findElement(By.className("search-empty-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("Avatar");
        driver.findElement(By.className("search-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-image")));
        driver.findElement(By.className("movie-image")).isDisplayed();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
