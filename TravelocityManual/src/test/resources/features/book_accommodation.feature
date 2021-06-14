Feature: Book accommodation on the travelocity website
  As a user of the travelocity website
  I need to book accommodation
  for my next trip

  Background:
    Then he will be able to choose and book the hotel that he likes

  @manual-result:passed
  @BookHotelUnder$99
  Scenario: Book hotel under $ 99
    Given The user is on the travelocity website and enters on travel deals
    When he selects the hotel option for less than $ 99

  @manual-result:passed
  @BookHotelFriendlyLGBTQ
  Scenario: Book Hotel Friendly LGBTQ
    Given The user is on the travelocity website and enters the search parameters for accommodation
    When he selects the Friendly LGTBQ option

  @manual-result:passed
  @BookHotelWithBreakfastAndOceanView
  Scenario: Book hotel with breakfast and ocean view
    Given The user is on the travelocity website and enters the search parameters for accommodation
    When he selects the Breakfast included filter and Ocean view filter