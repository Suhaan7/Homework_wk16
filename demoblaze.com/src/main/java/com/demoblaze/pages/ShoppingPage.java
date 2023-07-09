package com.demoblaze.pages;

import com.demoblaze.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class SignUpPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signUp;

    @CacheLookup
    @FindBy(xpath = "//h5[@id='signInModalLabel']")
    WebElement signUpPageText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement signUpButton;


    public void clickOnSignUp() {
        log.info("Click on Sign up Link" + signUp.toString() + "<br>");
        mouseHoverToElementAndClick(signUp);
    }

    public void enterUsername(String Username) {
        Reporter.log("Enter Username" + Username.toString() + "<br>");
        enterUsername.sendKeys(Username);
    }

    public void enterPassword(String Password) {
        Reporter.log("Enter Password" + Password.toString() + "<br>");
        enterPassword.sendKeys(Password);
    }

    public void clickOnSignUpButton() {
        Reporter.log("Click on Register Button" + signUpButton.toString() + "<br>");
        signUpButton.click();
    }

}
