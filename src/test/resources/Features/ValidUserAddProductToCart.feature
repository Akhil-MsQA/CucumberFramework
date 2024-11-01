Feature: Adding Product to the Cart

  Scenario: Valid User Addong Product to Cart
    Given Open the Browser AddtoCart
    And User Enters the Credentiels
    When Click on LoginButton
    And User Search for Product
    When Click on SearchButton
    And Click on the Product Description Checkbox
    And Click on Second SearchButton
    When Click on the Item
    And Print the Items Description
    Then Click on AddtoCart
    And Print the Success Message
    Then Click on the Cart Icon
    And Check the Item is Added Or Not
    Then Click on Logout
