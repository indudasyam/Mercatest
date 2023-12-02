@wip
Feature: AddItems Feature
  As a user I want to add items to the cart to purchase


  Scenario: Add the most expensive item to the cart by sorting

    Given the user is on the 'Landing Page'
    And the user enters username and password
    And the user clicks on login button
    Then the user should be navigated to 'Products Page' page
    And the user adds the most expensive item to the cart
    Then the user can see the most expensive item in the cart


