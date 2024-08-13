@Regression
Feature: create new account functionality


  Background: Setup create account scenario
    Given user click on "Sign in" link
    Then validate user is in sign in page
    Given user click on "Create New Account" link

    @UsingMap
    Scenario: using a map as data table
      When user enter new account info
      |name |Mansoor             |
      |email|random              |
      |password|Kbl00135!        |
      When user click on "Sign Up" button
      Then validate user is in account page
      Then validate email address in account page match

      @UsingList
      Scenario: using list as data table
        When user enter new account info using list data
        |Mansoor  |
        |random   |
        |Kbl00135!|
        When user click on "Sign Up" button
        Then validate user is in account page
        Then validate email address in account page match
