@smart
Feature: SmartBear Verification

  Scenario Outline: SmartBear name Verification

    Given User is logged into SmartBear Tester account
    When  Click on Order page
    And User fills out the form as followed from the table below:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<costumer name>" is in the list

    Examples:

      | product     | quantity | customer name  | street    | city    | state | zip   | cardType | card number  | expiration date | costumer name  |
      | MyMoney     | 1        | Ken Adams      | Kinzie st | Chicago | IL    | 60004 | Visa     | 313313133315 | 12/22           | Ken Adams      |
      | FamilyAlbum | 4        | Joey Tribbiani | State st  | Chicago | IL    | 60656 | Visa     | 123433533336 | 11/22           | Joey Tribbiani |