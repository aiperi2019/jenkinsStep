@wikiBackground
Feature: Wikipedia Search Functionality

#Background you create once and it will run for each scenario
  Background: Wikipedia Title Verification
    Given User is on wikipedia home page
    When User types "Steve Jobs" and look for it
    And User clicks searching button

  #Background you create once and it will run for each scenario

  Scenario: Wikipedia Title Verification
      Then Then User sees "Steve Jobs" is appear as title

  Scenario: Wikipedia Header Verification
    Then User sees "Steve Jobs" is in the main header