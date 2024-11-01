Feature: Login Functionality

  Scenario: Login With Valid Credentiels
    Given Open the Browser
    And User Enter the Credentiels
    When Click on the LoginButton
    Then User Enters to HomePage

  Scenario: Login With Invalid UserName
    Given Open the Browser
    And User Enter the Invalid UserName
    When Click on the LoginButton
    Then User Gets an UserName Error Message

  Scenario: Login With Invalid Password
    Given Open the Browser
    And User Enter the Invalid Password
    When Click on the LoginButton
    Then User Gets an Password Error Message

  Scenario: Login With Empty Username
    Given Open the Browser
    And User Enters only Password and Username Empty
    When Click on the LoginButton
    Then User Gets an UserName Error Message

  Scenario: Login With Empty Password
    Given Open the Browser
    And User Enter Only UserName
    When Click on the LoginButton
    Then User Gets an Password Error Message
