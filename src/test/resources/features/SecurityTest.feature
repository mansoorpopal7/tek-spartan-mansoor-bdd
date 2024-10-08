 @Smoke @Regression
Feature: Security tests scenarios

  Scenario: validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "mnsrpopal1@gmail.com" and "Kbl00135!" and click on logins
    #When user enter username and password and click on login button
    Then user should be able to see account link

   Scenario Outline: validate sign in with invalid username valid password
      When user click on sign in link
      Then validate user is in sign in page
      When user enter "<username>" and "<password>" and click on login
      Then user should see error "wrong username or password"
      Examples:
      |username            | password     |
      |invalid@gmail.com   |  Kbl00135!   |
      |mnsrpopal1@gmail.com| wrongpassword|
      |invalid@gmail.com   | wrongpassword|

  #Scenario: validate sign in with valid username invalid password
    #When user click on sign in link
    #Then validate user is in sign in page
    #When user enter "mnsrpopal1@gmail.com" and "wrongpassword" and click on login
    #Then user should see error "wrong username or password"


