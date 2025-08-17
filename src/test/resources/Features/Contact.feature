@Contact
Feature: Create Contact in application

  Background:
    Given user should be on login page
    When user enters valid userid
    And user enters valid password
    And user click on login button

  Scenario: Add_new_contact_in_application_TCContact01
    Given User should be on Home page
    When user enter first name and last name
    And Clicks the save button
    Then the contact should be added to the application