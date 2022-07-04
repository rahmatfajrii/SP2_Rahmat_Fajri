Feature: Sign In

  Scenario: Sign In with Valid Data
    Given User Navigate to Home Page Io
    When Click Button Sign In
    And Input Valid Email Password and Click Sign In
    Then User Success to Login