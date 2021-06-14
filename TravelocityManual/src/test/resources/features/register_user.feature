Feature: Register on the travelocity website
  As a user of the travelocity website
  I want to register on the site.
  Manage my trips and get discounts

  Background:
    Given The user is on the travelocity website

  @manual-result:passed
  @SuccessfulRegistration
  Scenario: Successful Registration
    When the User enters with the correct information for registration
    Then he will be able to authenticate on the website

  @manual-result:passed
  @IncorrectRegistration
  Scenario:Incorrect registration with an email already registered
    When the User enters with the incorrect information for registration
    Then he will be able to see the message: Account already exists.