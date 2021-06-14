Feature: Search vacation rentals on the travelocity website
  As a user of the travelocity website
  i need to search Vacation Rentals
  for my next trip

  @manual-result:passed
  @SuccessfulVacationRentals
  Scenario: Successful vacation rentals
    Given The user is on the travelocity website and enters the search parameters for vacation rentals
    When he specifies the property type to be apartment
    Then he can choose and reserve the apartment what else do you like

  @manual-result:passed
  @SearchVacationRentalsBusinessFriendly
  Scenario: Search Vacation Rentals Business Friendly
    Given The user is on the travelocity website and enters the search parameters for vacation rentals
    When he specifies the property type to be business friendly
    Then he can choose and reserve the vacation rental what else do you like