Feature: Test Facebook Application

  Scenario: validate login functionality
    Given user is on login page
    And user enter "Nikhil","Khalate" and "6368282"

  Scenario: validate passoword functionality
    When user enter password
    And date of birth

  Scenario: validate birth month and birth year
    When user enter birth month
    And user enter birth year

  Scenario: validate gender functionality
    When user select proper gender

  Scenario: validate already have an account functionality
    When user click on already have an account link
