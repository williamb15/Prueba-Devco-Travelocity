Feature: Search car
  As a user of travelocity
  I need to find a car
  For my next trip

  @CarForSixWithSpecialAARPRate
  Scenario: Search a car for 6 people, with a preferential rate for AARP members
    Given The user is on the travelocity website and enters the search parameters for car
      | deliveryPlace | returnPlace | pickUpDate | dropOffDate | pickUpTime | dropOffTime |
      | New york      | New york    | 09/08/2021 | 09/10/2021  | 12:00 pm   | 12:00 pm    |
    When he specifies that he needs a car for 6 people with a special price
    Then he will be able to see the cart information with the member tag AARP exclusive