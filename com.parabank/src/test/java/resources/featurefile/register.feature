Feature: Register Feature

  @sanity
  Scenario: Verify That SigningUp Page is Displayed
    Given I am on homepage
    When I click on Register Link
    Then I should see the welcome message "Signing up is easy!"

@smoke
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on Register Link
    And I enter First Name "Rudra"
    And I enter Last Name "Shivaay"
    And I enter Street "150C Greenford Close"
    And I enter City "Southampton"
    And I enter State "Southamptonshire"
    And I enter Zip Code "SH13RS"
    And I enter Phone Number "123456789"
    And I enter SSN "123"
    And I enter Username "RudraShiv"
    And I enter Password "Rush312"
    And I enter Confirm Password "Rush312"
    And I click on Register Button
    Then I should see the account creation confirm message

