Feature: Search flights
  As a user of travelocity
  I need to find a flight
  For my next trip

  @SuccessfulFlightNonStop
  Scenario: Search a faster round flight nonstop
    Given The user is on the travelocity website and enters the search parameters for flight
      | source   | destination | departing  | returning  | flightClass |
      | Medellin | San Andres  | 09/08/2021 | 09/10/2021 | Economy     |
    When he enters the search parameters and filter by Nonstop
    Then he will be able to see the flight faster and without stops and the Check out button