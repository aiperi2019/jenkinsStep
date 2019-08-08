@pen
Feature: Pen Verification
 @pen1
  Scenario: Pen title verification
   When User in on Pen application
   Then User should see Pen title
    And User searches for book

 @pen2
 Scenario:
   When User in on Pen application
   Then User delete book
   And User search for phone