Feature: Initial experience
  As a user I want a helpful and simple initial
  experience with the app. I should be able to get help
  and login to an existing WordPress site.

  @valid @AndroidPhone
  Scenario: Access to my account.
    Given I am at login page.
    When I enter valid credentials for self-hosted site.
    Then I can see posts for the self-hosted site.

  @valid
  Scenario: Try to access with invalid credentials.
    Given I am at login page.
    When I enter credentials for a invalid self-hosted site.
    Then I get informed that the WordPress site can't be connected.
    And I select to continue.
    And I am at login page.

  @valid
  Scenario: Try to access with malformed credentials.
    Given I am at login page.
    When I enter credentials for a malformed self-hosted site.
    Then I am at login page.

  @valid
  Scenario: Set my password to visible.
    Given I am at login page.
    And I enter a password.
    When I set my password to visible.
    Then I can see what password has been written.
