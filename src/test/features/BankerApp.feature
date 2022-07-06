Feature: BankApp

  Scenario: Account for user

    Given User should register to bank following data
      | Account Number | Routing Number |
      | 123412341234   | 123456789      |
    Then User should be successfully registered the bank with following data
      | Account Number | Routing Number |
      | 123412341234   | 123456789      |