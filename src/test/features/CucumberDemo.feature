
Feature:  Login functionality;
  # here we would write the feature name to be tested
  # We create one feature file per feature (functionality)


  Scenario: verify user can login with valid credentials

    Given User is login in to the https://www.facebook.com/
    When User enter test@test.com to email fields
    And User Should enter Hello1234 in password input field
    And User should click on log In button
    Then User should successfully logged in to the Facebook
