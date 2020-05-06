@Android @Checkout
Feature: Checkout

  Background:
    Given User is on moka start page
    And User login with correct email and password

  Scenario: Order Tenderloin Steak and Pay Exact Cash
    When User click Tenderloin Steak
    And User click Charge button
    And User input "70000" for cash on checkout pop up
    And User click Charge button on checkout pop up
    Then User is on receipt page
    And User see "No Change" as receipt page title

  Scenario: Order Tenderloin Steak and Pay with More Cash
    When User click Tenderloin Steak
    And User click Charge button
    And User input "75000" for cash on checkout pop up
    And User click Charge button on checkout pop up
    Then User is on receipt page
    And User see "Rp 5.000 Change" as receipt page title

  Scenario: Order Tenderloin Steak and Pay with Less Cash
    When User click Tenderloin Steak
    And User click Charge button
    And User input "60000" for cash on checkout pop up
    Then User cannot click Charge button on checkout pop up

  Scenario: Order Tenderloin Steak and Pay with Suggested Exact Cash
    When User click Tenderloin Steak
    And User click Charge button
    And User click first suggested cash
    And User click Charge button on checkout pop up
    Then User is on receipt page
    And User see "No Change" as receipt page title

  Scenario: Order Tenderloin Steak and Pay with Suggested More Cash
    When User click Tenderloin Steak
    And User click Charge button
    And User click second suggested cash
    And User click Charge button on checkout pop up
    Then User is on receipt page

  Scenario: Order 5 Tenderloin Steak that edited on Item Detail with Notes
    When User click Tenderloin Steak
    And User click Tenderloin Steak on shopping cart
    And User input "5" to quantity field
    And User input "Medium Rear" as notes
    And User click Save button
    Then User see the quantity of spaghetti is set to "x5" on shopping cart
    And User see there is "Medium Rear" below Spaghetti on shopping cart


  Scenario: Order Tenderloin Steak and Ice Tea
    When User click Tenderloin Steak
    And User click Ice Tea
    And User click Charge button
    And User click first suggested cash
    And User click Charge button on checkout pop up
    Then User is on receipt page
    And User see "No Change" as receipt page title