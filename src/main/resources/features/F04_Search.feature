@Regression
Feature: search feature

  Scenario Outline: user could search using product name
    Given user go to homepage
    And enter "<productname>"
    When user click enter
    Then search result contains "<productname>"
    Examples:
      |productname|
      |laptop|
      |nike|


  Scenario Outline: user could search for product using sku
      Given user go to homepage
      And enter serial "<sku>"
      When user click enter
      Then user found items with "<sku>" serial successfully
    Examples:
      | sku |
      |SCI_FAITH|
      |SF_PRO_11|
