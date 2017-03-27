@searchDemo
Feature: Search Demo for Parallel Run

  This File has been created to demonstrate parallel run

  Background:
    Given I am on the 'Landing' page

  Scenario: Product can be searched from the input box
    When I search for iPhone using the input box
    Then the 'Search Results' page for iPhone is displayed

  Scenario: Product can be browsed from the drop-down menu
    When I click 'Bangles' using the drop-down menu
    Then the 'Menu Item' page for Bangles is displayed

  Scenario: Product can be browsed from the icons
    When I click the 'Clothing' icon
    Then the 'Category' page for Clothing is displayed