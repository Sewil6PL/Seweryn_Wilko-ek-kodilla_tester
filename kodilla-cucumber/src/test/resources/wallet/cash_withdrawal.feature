Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Attempting to withdraw more money than available in the wallet
    Given I have deposited $200 in my wallet
    When I request $300
    Then the withdrawal should fail with a message indicating insufficient funds

  Scenario: Withdrawing the exact amount available in the wallet
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Attempting to withdraw money from an empty wallet
    Given I have deposited $0 in my wallet
    When I request $50
    Then the withdrawal should fail with a message indicating insufficient funds

  Scenario: Attempting to withdraw a negative amount of money
    Given I have deposited $200 in my wallet
    When I request -$50
    Then the withdrawal should fail with a message indicating insufficient funds

  Scenario: Attempting to withdraw zero amount of money
    Given I have deposited $200 in my wallet
    When I request $0
    Then the withdrawal should fail with a message indicating insufficient funds