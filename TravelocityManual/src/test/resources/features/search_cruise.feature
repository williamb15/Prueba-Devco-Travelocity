Feature: Search cruise trip in the travelocity website
  As a user of the travelocity website
  I need to search a cruise trip
  For my next vacation

  @manual-result:failed
  @manual-test-evidence:testFailedEvidence.pdf
  @SearchCruiseByChangingTheLanguageOfTheSite
  Scenario: Book cruise by changing the language of the site
    Given The user is on the travelocity website and changes the language option to Spanish
    When the User enters the search parameters for cruise
    Then he will be able to validate all available cruises

  @manual-result:passed
  @SearchSuccessfulCruise
  Scenario: Search cruise for 2 adults and 2 children
    Given The user is on the travelocity website and enters the search parameters for the cruise
    When he specifies the details of his trip with 2 adults and 2 childs
    Then he will be able to see the cruise summary and the Booking button