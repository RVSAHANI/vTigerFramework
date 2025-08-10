Feature: Account functionality

  Scenario: Validate accounts page
    Given user should be on login page
    When user enters valid userid
    And user enters valid password
    And user click on login button

