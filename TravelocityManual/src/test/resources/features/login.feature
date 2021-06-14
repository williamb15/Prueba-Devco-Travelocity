Feature: Authentication on the travelocity website
  As a user of the travelocity website
  I want to log in to the site
  To manage my trips

  Background:
    Given The user is on the travelocity website

  @manual-result:passed
  @SuccessfulLogin
  Scenario: Successful login
    When the User enters with the correct credentials
    Then he will verify that he successfully enters the website

  @manual-result:passed
  @IncorrectLogin
  Scenario: Incorrect Login
    When the User enters with the incorrect credentials
    Then he will verify that he no enters the website