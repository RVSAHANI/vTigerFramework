Feature: Account functionality

  Background:
    Given user should be on login page
    When user enters valid userid
    And user enters valid password
    And user click on login button

  @ap
  Scenario: Create_Account_with mandatory_fields_TC04
    When user click on new account link
    And user enters the Account Name and click on save button
    Then Account should be created successfully
