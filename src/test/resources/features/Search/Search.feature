@search
Feature: Search

  As a user
  I want to search for products
  So that I can buy them

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