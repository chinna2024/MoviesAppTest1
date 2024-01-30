package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    //Locators

    By headingText = By.className("movies-list-heading");
    By playButton = By.className("home-movie-play-button");
    By displayMovies = By.className("react-slick-item");
    By contactUsSection = By.className("contact-us-paragraph");

    //Constructors

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public String getHeadingText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(headingText));
        return driver.findElement(headingText).getText();
    }

    public boolean getPlayButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(playButton));
        return driver.findElement(playButton).isDisplayed();
    }


    public String getContactUsSection(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsSection));
        return driver.findElement(contactUsSection).getText();
    }
}
