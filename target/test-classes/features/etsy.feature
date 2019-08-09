Feature: Etsy Search Feature

@etsy
  Scenario: Etsy title verification using search feature
  Given User is on Etsy Homepage
  When User types "Wooden spoon" in the search box
    And User clicks search button
  Then User sees "Wooden spoon" is in the title

