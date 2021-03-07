@TransferService
Feature: transfer service test

  @base
  Scenario: Transfer money from one account to another
    Given user creates accounts:
      | accId | accPrefix| amount |
      | 00001 | Acc1     | 600    |
      | 00002 | Acc2     | 200    |
    When user transfers amount 100 from Acc1 to Acc2
    Then user gets account Acc2 and compares values with:
      | accId | accPrefix| amount |
      | 00002 | Acc2     | 300    |
    And user gets account Acc1 and compares values with:
      | accId | accPrefix| amount |
      | 00002 | Acc2     | 500    |