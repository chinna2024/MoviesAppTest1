import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MovieDetailsPageTest {
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
    public void MovieDetailsPage(){
        //In the Home Page click on any Movie and test all the UI elements present in it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt ='No Time to Die']")));
        driver.findElement(By.xpath("//img[@alt ='No Time to Die']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-title")));
        driver.findElement(By.className("movie-title")).isDisplayed();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("watch-time")));
        driver.findElement(By.className("watch-time")).isDisplayed();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("sensor-rating")));
        driver.findElement(By.className("sensor-rating")).isDisplayed();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.className("release-year")));
        driver.findElement(By.className("release-year")).isDisplayed();

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-overview")));
        driver.findElement(By.className("movie-overview")).isDisplayed();

        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.className("play-button")));
        driver.findElement(By.className("play-button")).isDisplayed();

        driver.findElement(By.className("genres-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Adventure']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Action']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Thriller']")).isDisplayed();
        driver.findElement(By.className("audio-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Spanish']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'French']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'English']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Italian']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Russian']")).isDisplayed();
        driver.findElement(By.className("rating-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '1396']")).isDisplayed();
        driver.findElement(By.className("rating-average-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '7.5']")).isDisplayed();
        driver.findElement(By.className("budget-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '24.2 Crores']")).isDisplayed();
        driver.findElement(By.className("release-date-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '29th September 2021']")).isDisplayed();
        driver.findElement(By.className("similar-movies-heading")).isDisplayed();
        driver.findElement(By.className("footer-icons-container")).isDisplayed();
        driver.findElement(By.className("contact-us-paragraph")).isDisplayed();

        //In the Popular Page click on any Movie and test all the UI elements present in it
        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Popular']")));
        driver.findElement(By.xpath("//a[text() = 'Popular']")).click();

        WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt = 'Venom']")));
        driver.findElement(By.xpath("//img[@alt = 'Venom']")).click();

        WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait9.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-title")));
        driver.findElement(By.className("movie-title")).isDisplayed();

        WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("watch-time")));
        driver.findElement(By.className("watch-time")).isDisplayed();

        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait11.until(ExpectedConditions.visibilityOfElementLocated(By.className("sensor-rating")));
        driver.findElement(By.className("sensor-rating")).isDisplayed();

        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait12.until(ExpectedConditions.visibilityOfElementLocated(By.className("release-year")));
        driver.findElement(By.className("release-year")).isDisplayed();

        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait13.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-overview")));
        driver.findElement(By.className("movie-overview")).isDisplayed();

        WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait14.until(ExpectedConditions.visibilityOfElementLocated(By.className("play-button")));
        driver.findElement(By.className("play-button")).isDisplayed();

        driver.findElement(By.className("genres-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Action']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Adventure']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Fantasy']")).isDisplayed();
        driver.findElement(By.className("audio-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'English']")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = 'Mandarin']")).isDisplayed();
        driver.findElement(By.className("rating-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '2606']")).isDisplayed();
        driver.findElement(By.className("rating-average-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '7.9']")).isDisplayed();
        driver.findElement(By.className("budget-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '10 Crores']")).isDisplayed();
        driver.findElement(By.className("release-date-heading")).isDisplayed();
        driver.findElement(By.xpath("//p[text() = '1st September 2021']")).isDisplayed();
        driver.findElement(By.className("similar-movies-heading")).isDisplayed();
        driver.findElement(By.className("footer-icons-container")).isDisplayed();
        driver.findElement(By.className("contact-us-paragraph")).isDisplayed();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
