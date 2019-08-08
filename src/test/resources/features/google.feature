  @back
  Feature: Google Title verification

  Background:  Login to Google
    When User in Google search page

  @googleTitle
  Scenario: Google title verification
    And User searches for apples
    Then User should see apples inside of the title


    @new
    Scenario: Google Title verification with preferred data
      And User searches for a word "iphone"
      Then user should see a word "iphone" inside of the title

  @dataType
  Scenario: Google Title test
    Given User tests with words "apple" "pen" "paper"
    Then User checks the numbers and 12 and 55

