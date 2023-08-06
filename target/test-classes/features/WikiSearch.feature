Feature:  Wiki Search Features

  @wikiSearch
  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  @wikiSearch
  Scenario:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @wikiSearch
  Scenario:Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  @wikiScenarioOutline
  Scenario Outline: Wikipedia search functionality with scenario outline
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    Examples: search values are going to be using in this scenario outlines
      | searchValue | expectedTitle | expectedMainHeader | expectedImageHeader |
      | Steve Jobs  | Steve Jobs    | Steve Jobs         | Steve Jobs          |
      | Marry Barra | Marry Barra   | Marry Barra        | Marry Barra         |
      | Carl Sagan  | Carl Sagan    | Carl Sagan         | Carl Sagan          |


