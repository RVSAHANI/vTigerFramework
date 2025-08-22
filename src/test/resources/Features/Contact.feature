Feature: Contact functionality

  Background:
    Given user should be on login page
    When user enters valid userid
    And user enters valid password
    And user click on login button

  @cp
  Scenario: Create_Contact_with mandatory_fields_TC05
    When user click on new contact link
    And user enters the Last Name and click on save button
    Then Contact should be created successfully
