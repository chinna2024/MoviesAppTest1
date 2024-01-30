package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    //Locators

    By LogoImage = By.className("login-website-logo");
    By headingText = By.className("sign-in-heading");
    By usernameLabel = By.xpath("//label[text() = 'USERNAME']");
    By passwordLabel = By.xpath("//label[text() = 'PASSWORD']");
    By loginButton = By.className("login-button");
    By errorMessage = By.className("error-message");


    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Methods
    public boolean isLogoDisplayed(){
        return driver.findElement(LogoImage).isDisplayed();
    }

    public String getHeadingText(){
        return driver.findElement(headingText).getText();
    }

    public String getUsernameLabel(){
        return driver.findElement(usernameLabel).getText();
    }

    public String getPasswordLabel(){
        return driver.findElement(passwordLabel).getText();
    }

    public boolean isLoginButtonDisplayed(){
        return driver.findElement(loginButton).isDisplayed();
    }

    public void login(String username, String password){
        driver.findElement(By.id("usernameInput")).sendKeys(username);
        driver.findElement(By.id("passwordInput")).sendKeys(password);
        driver.findElement(loginButton).click();
    }


    public String getErrorMesssage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message")));
        return driver.findElement(errorMessage).getText();
    }


}