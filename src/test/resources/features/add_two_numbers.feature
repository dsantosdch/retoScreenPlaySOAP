Feature: Add two numbers on dneonline service
  As a user i want to add two numbers

  Scenario: Add two numbers
    When you add two numbers
    | 2 | 4 |
    Then i should see the response of the service is 200