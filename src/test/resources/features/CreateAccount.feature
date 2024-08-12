 @Regression
Feature: Create new account functionality

  # steps this is common between scenarios of specific feature
  # background steps will execute at beginning of each scenario

  Background: setup create account scenario
    Given user click on "Sign in" link
    Then validate user is in sign in page
    Given user click on "Create New Account" link

  Scenario: create valid account with random email
    When user enter "Mansoor" and "random" and "Kabul123?"
    When user click on "Sign Up" button
    Then validate user is in account page
    Then validate email address in account page match

     @UserStory1
    Scenario: create account with existing email
      When user enter "Mansoor" and "mnsrpopal1@gmail.com" and "Kabul123?"
      When user click on "Sign Up" button
      Then user should see error "this email is already exist, please use another email address"






