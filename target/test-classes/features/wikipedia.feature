
@wiki
Feature: Wikipedia Search Functionality
 @wikiTitle

 Scenario:Wikipedia Title Verification
 Given User is on wikipedia home page
 When User types "Steve Jobs" and look for it
 And User clicks searching button
Then User sees "Steve Jobs" is appear as title

  @wikiTitle2
 Scenario: Wikipedia Header Verification
 Given User is on wikipedia page
 When User look for "Steve Jobs"
 And User will clicks search button
 Then User sees "Steve Jobs" is in the main header
