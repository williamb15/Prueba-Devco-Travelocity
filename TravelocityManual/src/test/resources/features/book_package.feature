Feature: Book package on the travelocity website
  As a user of the travelocity website
  I need to book package
  for my next trip

  Background:
    Then he will be able to choose and book the package that he likes

  @manual-result:passed
  @SuccessfulBookingOfPackageWithHotelAndFlight
  Scenario:Successful booking of package with hotel and flight
    Given The user is on the travelocity website and enters the search parameters for package
    When he specifies the details of his package hotel + flight

  @manual-result:passed
  @SuccessfulBookingOfPackageWithFlightAndCar
  Scenario:Successful booking of package with flight and car
    Given The user is on the travelocity website and enters the search parameters for package
    When he specifies the details of his package flight + car

  @manual-result:passed
  @SuccessfulBookingOfPackageWithHotelAndCar
  Scenario:Successful booking of package with hotel and car
    Given The user is on the travelocity website and enters the search parameters for package
    When he specifies the details of his package hotel + car