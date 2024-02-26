@Regression
Feature: follow us link

 Scenario: user go to facebook
    Given user go to homepage
    When user click on facebook icon
    And user wait for loading of new window
    Then user found facebook page

  Scenario: user opens twitter link
    Given user go to homepage
    When user click on twitter icon
    And user wait for loading of new window
    Then user found twitter page

  Scenario:user opens rss link
    Given user go to homepage
    When user click on rss icon
    Then user found rss page

  Scenario: user opens youtube link
    Given user go to homepage
    When user click on youtube icon
    And user wait for loading of new window
    Then user found youtube page