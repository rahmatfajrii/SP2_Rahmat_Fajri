Feature: Sign Up

  Scenario: Sign Up with Invalid Data
    Given User Navigate to Home Page Io
    When Click Button Sign In
    And Input Email Adrress and Click Button Create
    And Input Invalid Data and Click Register
    Then User Failed to Register Account