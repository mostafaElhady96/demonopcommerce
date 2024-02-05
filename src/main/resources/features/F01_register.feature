   Feature: F01_Register | users could register with new accounts


    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user select gender type
      And user enter "Ahmed" as username and "Khaled" as lastname
      And user enter date of birth
      And user enter enter "Ahmed@gmail.com" in email field
      And user fill "Mostafa@" as paswword and "Mostafa@" as confirmpassword field
      And user click on register button
      Then success message is displayed


