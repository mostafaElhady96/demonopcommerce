Feature: currency applied on all product
  @Regression
  Scenario: apply euro on products
    Given user go to homepage
    When user click on euro
    Then i check euro applied successfully