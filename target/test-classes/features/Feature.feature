@SmokeTest
Feature: API Demo App

  Background: Desired Capabilities
    Given User enter the desired capabilities

  Scenario: User perform tap functionality using TouchAction class
    Given User taps on Access'ibility button
    When User taps on Accessibility node querying
    Then User turn on the Do taxes radio button

  Scenario: User performs click and hold functionality using longPress method
    Given User clicks on views button
    When User clicks on Expandable Lists button
    Then User click and holds on Custom Adapter

  Scenario: User handles the autocomplete dropdown and selects one value
    Given User clicks on view button
    When User clicks on auto-complete button
    And User click on screen-top button
    Then User searches for the third option that is United states

  Scenario: User handles the autocomplete dropdown and selects multiple values
    Given User click on views button
    When User click on auto-complete button
    And User clicks on multiple-items
    Then User selects multiple value from the auto-complete dropdown

#  Scenario: User uses UiSelector to locate the elements
#    Given User click on app button
#    When User clicks on Alert Dialogs box
#    And User clicks on List Dialog box


  Scenario: User scrolls the views page
    Given User scrolls the page to the last

  Scenario: User scrolls the Scrollable page horizontally
    Given User is on the Scrollable page
    Then User prints the data of tab20 of Scrollable page

  Scenario: User handles the Toast message
    Given User handles the toast message inside the colorbox window

  Scenario: User swipes the page
    Given User is on the view page of Api demo app
    When User searched for date widgets
    And User selects inline option
    Then User swipes the minutes from 15 to 45

    Scenario: User is handling drag and drop
      Given User is on the views page of Api demo app
      When Uses chooses option drag and drop
      Then User performs the drag and drop functionality



