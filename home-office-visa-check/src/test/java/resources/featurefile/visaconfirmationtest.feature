Feature: Visa Confirmation Test
As a user I want to verify Visa confirmation Result

  Background:
  Given I am on Check UK Visa Page
    When  I click on start button

  Scenario: An Australian coming to UK for Tourism

  And I select Nationality "Australia"
  And I click on Continue button
  And I select reason "Tourism or visiting family and friends"
  And I click on Continue button
#    Then verify result "You will not need a visa to come to the UK"


  Scenario: A Chilean coming to the UK for Work and Plans on staying for longer than six months

  And I select Nationality "Chile"
  And I click on Continue button
  And I select reason "Work, academic visit or business"
  And I click on Continue button
  And I select intendent to stay for "longer than 6 months"
  And I click on Continue button
  And I select "Health and care professional"
  And I click on Continue button
#    Then verify result "You need a visa to work in health and care"

  Scenario: A Columbian national coming to the UK to join a partner for a long stay they do have an Article 10 or 20 Card

  And I select Nationality "Colombia"
  And I click on Continue button
  And I select reason "Join partner or family for a long stay"
  And I click on Continue button
#    Then verify result "You may need a visa"



