# language: en
Feature: Happy Baby

  Scenario: A baby should smile when it is happy
    Given I have a baby
    When I make a baby happy
    Then the baby should smile