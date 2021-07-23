Feature: Login Action

  Background: This is like before test


  Scenario Outline: Successful LogOut
    Given The application is up
    Given The application is up with parma "testuser_P" and "testuser"
    Given The application is up with parma "<username>" and "<password>"
    And Data tables are used
      | testuser_1 | Test@153 |
    When User LogOut from the Application

    Then Message displayed LogOut Successfully
    Examples:
      | username   | password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@153 |