package com.demoblaze.pages;

import com.demoblaze.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='About us']")
    WebElement aboutUs;

    @CacheLookup
    @FindBy (xpath = "")

    public void aboutUsPage(){

        log.info("Click on About Us Link" + aboutUs.toString() + "<br>");
        clickOnElement(aboutUs);
    }




}
