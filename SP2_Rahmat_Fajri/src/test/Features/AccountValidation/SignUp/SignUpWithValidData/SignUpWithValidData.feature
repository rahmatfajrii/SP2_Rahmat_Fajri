Feature: Sign Up

  Scenario: Sign Up with Valid Data
    Given User Navigate to Home Page Io
    When Click Button Sign In
    And Input Email Adrress and Click Button Create
    And Input Valid Data and Click Register
    Then User Success to Register Account