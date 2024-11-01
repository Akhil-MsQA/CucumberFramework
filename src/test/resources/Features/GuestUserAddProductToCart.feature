Feature: Guest User Add Product to Cart

  Scenario: Adding Product to Cart
    Given Open the Browser for GuestUser
    And Search for a Product
    When Click on the SearchButton
    Then click on the Checkbox
    And Again click on the Second SearchButton
    And Click on the Product Item
    Then click on the AddToCart
    And Print the Guest Success Message
    When Click on the Shopping Cart
    And Check the Product is Added
    Then Close the Browser
