Feature: Data Table Practice

   Scenario: Order kimchi from Arigato

    Given user is om NambaFood
    When user click Food
    Then user should see "250 best cafe"
    And user should find Sushi category
    When user click on Sushi
    Then user should see list of cafes
    And user should scroll down the page Arigato cafes
    When user click on Arigato
    Then user should see Menu
    And user should find Kimchi
    When user increase Kimchi amount to 3
    And user should click on order button
    Then on the card user should see "450s"
