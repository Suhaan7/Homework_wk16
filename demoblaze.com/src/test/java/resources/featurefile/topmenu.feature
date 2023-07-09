Feature: Top Menu Test
As a user I want to verify Top Menu Bar is working successfully

  Background:
  Given I am on Home Page

  Scenario: Verify User Should Navigate To About Us Page

  And I click on About Us Link
  Then verify text "About us"

  Scenario: Verify User Should Navigate To Contact Page

    And I click on Contact Link
    Then verify text "New message"




