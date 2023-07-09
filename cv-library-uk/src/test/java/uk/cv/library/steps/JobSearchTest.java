package uk.cv.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.cv.library.pages.HomePage;

public class JobSearchTest {
    @Given("^: I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
        new HomePage().enterJobTitle(jobTitle);

    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);

    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)  {
        new HomePage().selectDistanceDropDown(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionsLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String minSalary)  {
        new HomePage().enterMinSalary(minSalary);

    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String maxSalary)  {
new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new HomePage().selectJobType(jobType);

    }

    @And("^click on 'Find Jobs' button$")
    public void clickOnFindJobsButton() {
        new HomePage().clickOnFindJobsBtn();
    }

    @And("^I enter following data for Job Searches$")
    public void iEnterFollowingDataForJobSearches() {
    }

    @Then("^I see the Results$")
    public void iSeeTheResults() {
        new HomePage().verifyTheResults();

    }
}
