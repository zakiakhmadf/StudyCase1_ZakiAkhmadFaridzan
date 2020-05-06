@Android @Login
Feature: Login

  Scenario: Login with Correct Email and Correct Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "zakiakhmadf20@gmail.com"
    And User input password "abc12345"
    And User click Sign in button
    Then User success login

  Scenario: Login with Correct Phone and Correct Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "081223176617"
    And User input password "abc12345"
    And User click Sign in button
    Then User success login

  Scenario: Login with Correct Email and Incorrect Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "zakiakhmadf20@gmail.com"
    And User input password "abc1234"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Correct Phone and Incorrect Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "081223176617"
    And User input password "abc1234"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Incorrect Email and Correct Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "zakiakhmadf200@gmail.com"
    And User input password "abc12345"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Incorrect Phone and Correct Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "081223176625"
    And User input password "abc12345"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Incorrect Email and Incorrect Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "zaki@gmail.com"
    And User input password "abcabc123"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Incorrect Phone and Incorrect Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "081223176124"
    And User input password "abcabc123"
    And User click Sign in button
    Then User see error message "Authentication failed. Please check your username and password."

  Scenario: Login with Empty Email and Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email ""
    And User input password ""
    And User click Sign in button
    Then User cannot click Sign in button

  Scenario: Login with Empty Email and Correct Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email ""
    And User input password "abc12345"
    And User click Sign in button
    Then User cannot click Sign in button

  Scenario: Login with Correct Email and Empty Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "zakiakhmadf20@gmail.com"
    And User input password ""
    And User click Sign in button
    Then User cannot click Sign in button

  Scenario: Login with Correct Phone and Empty Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "081223176617"
    And User input password ""
    And User click Sign in button
    Then User cannot click Sign in button