package com.parabank.steps;

import com.parabank.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LoginSteps {

    @Given("^I is on homepage$")
    public void iIsOnHomepage() {
    }

    @And("^I enter valid username \"([^\"]*)\"$")
    public void iEnterValidUsername(String username)  {
        new LoginPage().enterUserName(username);

    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password)  {
        new LoginPage().enterPassword(password);

    }
    @Then("^user click on Login button$")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
    new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String expected)  {
        Assert.assertEquals(expected,new LoginPage().verifyErrorMessage());
    }

    @And("^I should click on Login button$")
    public void iShouldClickOnLoginButton() {
    }

    @And("^I click on Logout Link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutButton();
    }

    @Then("^I see the text \"([^\"]*)\"$")
    public void iSeeTheText(String expected)  {
        Assert.assertEquals(expected,new LoginPage().verifyCustomerLoginText());
    }

}
