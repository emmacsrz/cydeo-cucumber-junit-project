Feature: Bing search functionality
  Agile story: as a user, when i am on the bing search page and search for "orange" the title should be "orange - Search"


  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters orange in the search box
    Then user should see orange in the title


  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters "orange" in the search box
    Then user should see "orange - Search" in the title



