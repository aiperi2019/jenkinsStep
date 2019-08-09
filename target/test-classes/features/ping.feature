@pingpong
Feature: Reservation Ping Pong
  Scenario: Ping Pong  reservation and verification

    Given User is in Home Page
    When User clicks on Register Ping Pong button
    Then User should be able click on Buy Ticket button
    When User enters quantity for tickets
    And  User clicks checkout
    Then User is on  Add Your Deatails page
    When User fill up details information
    And  User click continue
    Then User should be on Thank you page
    When User clicks Add to Calendar
    And  User selects email
    Then User should be on Calendar page
    And  User should be able to modify suitable dates and time
    And  User should be able invite existing quests
    When User should be able to click save button
    Then User should be able to see and click send button on Pop Up window
    And  User should be able to see event save Pop Up window