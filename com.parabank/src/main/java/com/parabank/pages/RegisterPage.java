package com.parabank.pages;

import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='title']")
    WebElement signingUpPageText;

    @CacheLookup
    @FindBy(id = "customer.firstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "customer.lastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "customer.address.street")
    WebElement enterStreet;

    @CacheLookup
    @FindBy(id = "customer.address.city")
    WebElement enterCity;

    @CacheLookup
    @FindBy(id = "customer.address.state")
    WebElement enterState;
    @CacheLookup
    @FindBy(id = "customer.address.zipCode")
    WebElement enterZipCode;

    @CacheLookup
    @FindBy(id = "customer.phoneNumber")
    WebElement enterPhoneNumber;
    @CacheLookup
    @FindBy(id = "customer.ssn")
    WebElement enterSsn;

    @CacheLookup
    @FindBy(id = "customer.username")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(id = "customer.password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "repeatedPassword")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Register']")
    WebElement clickOnRegisterButton;


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public String verifySigningUpPageText() {
        log.info("Get text from : " + signingUpPageText.toString());
        return getTextFromElement(signingUpPageText);
    }

    public void enterFirstName(String firstName) {
        Reporter.log("Click on Firstname" + firstName.toString() + "<br>");
        enterFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        Reporter.log("Click on Lastname" + lastName.toString() + "<br>");
        enterLastName.sendKeys(lastName);
    }

    public void enterStreet(String Street) {
        Reporter.log("Click on Street" + Street.toString() + "<br>");
        enterStreet.sendKeys(Street);
    }

    public void enterCity(String City) {
        Reporter.log("Click on City" + City.toString() + "<br>");
        enterCity.sendKeys(City);
    }

    public void enterState(String State) {
        Reporter.log("Click on State" + State.toString() + "<br>");
        enterState.sendKeys(State);
    }

    public void enterZipCode(String zipCode) {
        Reporter.log("Click on ZipCode" + zipCode.toString() + "<br>");
        enterZipCode.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Reporter.log("Click on Phone Number" + phoneNumber.toString() + "<br>");
        enterPhoneNumber.sendKeys(phoneNumber);
    }

    public void setEnterSsn(String Ssn) {
        Reporter.log("Click on Ssn" + Ssn.toString() + "<br>");
        enterSsn.sendKeys(Ssn);
    }

    public void enterUserName(String userName) {
        Reporter.log("Click on Username" + userName.toString() + "<br>");
        enterUsername.sendKeys(userName);
    }

    public void enterPassword(String Password) {
        Reporter.log("Click on Password" + Password.toString() + "<br>");
        enterPassword.sendKeys(Password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Click on Confirm Password" + confirmPassword.toString() + "<br>");
        enterConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on Register Button" + clickOnRegisterButton.toString() + "<br>");
        clickOnRegisterButton.click();
    }


}
