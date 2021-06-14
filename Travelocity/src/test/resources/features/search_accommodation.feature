Feature: Search accommodation
  As a user of travelocity
  I need to find a place to stay
  For my next trip

  Background:
    Given The user is on the travelocity website and enters the search parameters for accommodation
      | destination | checkin    | checkout   |
      | Medellin    | 09/08/2021 | 09/10/2021 |

  @MostEconomicalAccommodationForASpecificArea
  Scenario Outline: Search cheaper accommodation in a specific area
    When he enters filters by <zone> and <filter>
    Then he will be able to see the summary of the query and Price details
    Examples:
      | zone          | filter |
      | La Candelaria | Price  |
