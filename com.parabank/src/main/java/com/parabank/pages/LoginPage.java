package com.parabank.pages;

import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='title']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Customer Login']")
    WebElement customerLoginText;

    public void enterUserName(String userName) {
        Reporter.log("Click on Username" + userName.toString() + "<br>");
        enterUsername.sendKeys(userName);
    }

    public void enterPassword(String Password) {
        Reporter.log("Click on Password" + Password.toString() + "<br>");
        enterPassword.sendKeys(Password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyErrorMessage() {
        log.info("Verify Error Message: " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }
    public String verifyCustomerLoginText() {
        log.info("Verify Error Message: " + customerLoginText.toString());
        return getTextFromElement(customerLoginText);
    }
}
