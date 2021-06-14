Feature: Book flight on the travelocity website
  As a user of the travelocity website
  I need to book a flight
  for my next trip

  Background:
    Then he will be able to choose and book the flight that he likes

  @manual-result:passed
  @BookFlightUnder$200
  Scenario: Book flight under $ 200
    Given The user is on the travelocity website and enters on travel deals
    When he selects the flight option for less than $ 200

  @manual-result:passed
  @BookFlightDepartureTimeMorning
  Scenario: Book flight departure time morning
    Given The user is on the travelocity website and enters the search parameters for flight
    When he selects the departure time morning option

  @manual-result:passed
  @BookFlightInFirstClass
  Scenario: Book flight in first class
    Given The user is on the travelocity website and enters the search parameters for flight
    When he select first class option
