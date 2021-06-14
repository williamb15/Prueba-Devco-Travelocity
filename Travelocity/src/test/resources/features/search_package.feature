Feature: Search package
  As a user of travelocity
  I need to find a package
  For my next trip

  @SuccessfulPackageWithHotelFlightAndCar
  Scenario: Search a package with hotel, flight and car
    Given The user is on the travelocity website and enters the search parameters for package
      | hotel | flight | car  | source   | destination | departing  | returning  | flightClass |
      | true  | true   | true | Medellin | New York    | 09/08/2021 | 09/10/2021 | Economy     |
    When he specifies the details of his package
      | zone      | filterAccommodation | stops  | capacityCar | memberAARP |
      | Manhattan | Price + our picks   | 1 Stop | 4           | No         |
    Then he will be able to see the package summary and the Complete Booking button