@smoke222
Feature: Amazon verification
  User Story: US44
  #Comments goes using this sing
  #What ever here is scenario

   @amazon
    Scenario: Amazon title verification
    When User in on Amazon application
    Then User should see Amazon in title


    @amazon2
    Scenario: Amazon search verification
      When User in on Amazon application
      When User searches for something

