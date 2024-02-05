Feature: home slider

  Scenario: first slider is clickable on home page
    Given user go to homepage
    When User click on first slider
    Then user found item of first slide successfully



    Scenario: second slider is clickable on home page
      Given user go to homepage
      When user click on slider button
      And wait for page loading
      Then user found item of second slide successfully