@regression
Feature: Login Feature

  Background: I am on homepage

  As user I want to Login into parabank website

  @unit
  Scenario: User should Login Successfully with valid credentials
    And I enter valid username "RudShi"
    And I enter valid password "312"
    Then user click on Login button
    And I click on Logout Link
    Then I see the text "Customer Login"

  @regression
  Scenario Outline: User should get error message when enter invalid credentials
    And I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"

    Examples:
    |username      |   password  |    errorMessage |
    |RudShi        |67890        |Error! |
    |RS            |9898         |Error! |
    |SR            |989898       |Error! |








