
Feature: Title of your feature
  Background:
  @validcredentials
  Scenario: login with valid credentials
    Given when the user is in demoshop loginpage
    When user click on login
   And user enter a valid username and password
   And user click loginbutton
   Then user login and get sucessful message
  @invalidcrendentials
  Scenario Outline:login with invalid credentials
    Given when the user is in demoshop loginpage
    When the users enters invalid credentials
    And user click on login button
    Then error message has to be displayed
