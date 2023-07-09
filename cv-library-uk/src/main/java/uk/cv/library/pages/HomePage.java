package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.cv.library.utility.Utility;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;

    @CacheLookup
    @FindBy(css ="div[class='home-search hps-transition'] input[name='geo']" )
    WebElement Location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement verifyTheResults;

    public void enterJobTitle(String jobtitle) {
        log.info("Enter Job Title`" + JobTitle.toString() + "<br>");
       sendTextToElement(JobTitle,jobtitle);
    }

    public void enterLocation(String location) {
        log.info("Enter Location: " + Location.toString());
        sendTextToElement(Location,location);
    }

    public void selectDistanceDropDown(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionsLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter Salary Min" + salaryMin.toString() + "<br>");
        sendTextToElement(salaryMin,minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Salary Max" + salaryMax.toString() + "<br>");
        sendTextToElement(salaryMax,maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        log.info("Select Salary Type" + salaryTypeDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salaryType);
    }

    public void selectJobType(String jobType) {
        log.info("Select Job Type" + jobTypeDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }
    public void clickOnFindJobsBtn() {
        Reporter.log("Click on Find Jobs Button" + findJobsBtn.toString() + "<br>");
        findJobsBtn.click();
    }


    public String verifyTheResults() {
        log.info("Verify Results: " + verifyTheResults.toString());
        return getTextFromElement(verifyTheResults);
    }

}
