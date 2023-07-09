package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//label[@for='response-1']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "longer than 6 months":
                (moreThanSixMonths).click();
                break;

            case "6 months or less":
               (lessThanSixMonths).click();
                break;

            default:
                System.out.println("Not Found");
        }
    }
    public void clickContinueButton() {
        Reporter.log("Click on Continue Button" + continueButton.toString() + "<br>");
        clickOnElement(continueButton);
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

}

