Feature: This feature to setup framework
   @Smoke
  Scenario: validate top left corner logo
   # Given open browser and navigate to retail app
    Then validate top left corner
    #Then close the browser
   @Smoke
  Scenario: validate logo and sign in button
    #Then Validate top left corner is TEKSCHOOL
    Then validate sign in button is enabled
