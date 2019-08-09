@so
Feature: Wikipedia Search Functionality


  Scenario Outline:Wikipedia Title Verification

    Given User is on wikipedia home page
    When User types "<searchKey>" and look for it
    And User clicks searching button
    Then User sees "<title>" is appear as title

    Examples: Test data for search functionality

    |searchKey   |title       |
    |Steve Jobs  |Steve Jobs  |
    |Ricky Martin|Ricky Martin|
    |Lady Gaga   |Lady Gaga   |
    |Lionel Messi|Lionel Messi|

    #everything between pipes are different data
    #option command L for aligning pipes automatically