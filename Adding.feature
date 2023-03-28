

 @Adding
  Feature: This adding to draft Feature
  Scenario: Adding item to draft Scenario
    Given user search for item
    And user item is selected
    When user is adding it to draft
   
    Then user increase the draft
   