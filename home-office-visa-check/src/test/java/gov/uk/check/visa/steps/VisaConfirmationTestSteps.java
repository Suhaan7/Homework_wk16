package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.testng.Assert;

public class VisaConfirmationTestSteps {

    @Given("^I am on Check UK Visa Page$")
    public void iAmOnCheckUKVisaPage() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartNowBtn();
    }

    @And("^I select Nationality \"([^\"]*)\"$")
    public void iSelectNationality(String nationality)  {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueBtn();
    }

    @And("^I select reason \"([^\"]*)\"$")
    public void iSelectReason(String reason)  {
new ReasonForTravelPage().selectReasonForVisit(reason);
    }

   @And("^I select intendent to stay for \"([^\"]*)\"$")
    public void iSelectIntendentToStayFor(String moreOrLess)  {
new DurationOfStayPage().selectLengthOfStay(moreOrLess);
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String JobType)  {
        new ReasonForTravelPage().selectTypeOfJob(JobType);
    }

    @Then("^verify result \"([^\"]*)\"$")
    public void verifyResult(String expectedresult)  {
        Assert.assertEquals(new ResultPage().confirmResultMessage1(),expectedresult,"The text is not verified");
    }
}
