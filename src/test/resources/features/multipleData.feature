Feature: Testing with multiple data

  @multiple
  Scenario: Testing data
    Given User goes to Amazon website
    And User verifies following search departments
    |Alexa Skills|
    |Computers   |
    |Digital Music|
    |Courses      |
    |Baby         |
    And Compare the given search departments to the existing
    Then User closes the amazon

