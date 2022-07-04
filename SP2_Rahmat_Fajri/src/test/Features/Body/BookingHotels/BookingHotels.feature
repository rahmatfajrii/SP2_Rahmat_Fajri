Feature: Booking Hotels

  Scenario: How to User Booking Hotels
    Given User Navigate to Home Page Io
    When Login with Valid Account First
    And Click Home and Input The Hotel Want to Book and Then Click Search
    And Click Book Now and Input Required Data and Click Save
    And Click Process and Click Payment With and Confirm Order
    Then User Success to Booking Hotel