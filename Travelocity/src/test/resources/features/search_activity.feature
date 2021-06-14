Feature: Search activity
  As a user of travelocity
  I need to find a specific activity
  For my next trip

  @successfulSearchForSpecificActivity
  Scenario: Search a specific activity to do
    Given The user is on the travelocity website and enters the search parameters for activity
      | place    | startDate  | endDate    |
      | Medellin | 09/08/2021 | 09/10/2021 |
    When he is interested in the pablo escobar tour
    Then he will be able to see all the information about the tour