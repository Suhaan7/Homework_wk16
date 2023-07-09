package com.parabank.steps;

import com.parabank.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("^I click on Register Link$")
    public void iClickOnRegisterLink() {
     new RegisterPage().clickOnRegisterLink();
    }

    @Then("^I should see the welcome message \"([^\"]*)\"$")
    public void iShouldSeeTheWelcomeMessage(String expected)  {
       Assert.assertEquals(expected,new RegisterPage().verifySigningUpPageText());
       }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().enterFirstName(lastName);
    }

    @And("^I enter Street \"([^\"]*)\"$")
    public void iEnterStreet(String Street)  {
        new RegisterPage().enterFirstName(Street);
    }

    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String City)  {
    new RegisterPage().enterCity(City);
    }

    @And("^I enter State \"([^\"]*)\"$")
    public void iEnterState(String State)  {
        new RegisterPage().enterCity(State);
    }

    @And("^I enter Zip Code \"([^\"]*)\"$")
    public void iEnterZipCode(String zipCode)  {
        new RegisterPage().enterCity(zipCode);
    }

    @And("^I enter Phone Number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNumber)  {
        new RegisterPage().enterCity(phoneNumber);
    }

    @And("^I enter SSN \"([^\"]*)\"$")
    public void iEnterSSN(String ssn)  {
        new RegisterPage().enterCity(ssn);
    }

    @And("^I enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new RegisterPage().enterCity(username);

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegisterPage().enterCity(password);
    }

    @And("^I enter Confirm Password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        new RegisterPage().enterCity(confirmPassword);
    }

    @And("^I click on Register Button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should see the account creation confirm message$")
    public void iShouldSeeTheAccountCreationConfirmMessage() {
        new RegisterPage().verifySigningUpPageText();
    }
}
