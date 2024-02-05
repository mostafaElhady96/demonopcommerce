@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given user go to login page
  And user login with valid "Ahmed@gmail.com" in email field  and "Mostafa@" in passwordfield
  When user press on login button
  Then user login to the system successfully



  Scenario: user could login with invalid email and password
  Given  user go to login page
  And user login with "invalidwrong@gmail.com" and "P@ssword"
  When user press on login button
  Then user could not login to the system