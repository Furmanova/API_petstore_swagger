Feature: Add User

  Background:
    Given I have access token

  @api @add_user
  Scenario: Add new user

    When I make POST request for the endpoint 'user'
    Then I see status code 200

  @api
  Scenario: Get user

    Given I make GET request for the endpoint 'user'
    When I make GET request for the endpoint 'user'
    Then I see status code 200
