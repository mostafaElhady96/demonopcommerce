Feature: wishlist feature

  Scenario: add item to wishlist and confirm added successfully
    Given user go to login page
    When user login with valid "Ahmed@gmail.com" in email field  and "Mostafa@" in passwordfield
    And user press on login button
    And choose item to add to wishlist
    Then success message of adding item to wishlist
    And wait for message disappear
    And go to wishlist
    Then user found Qty value bigger than zero




