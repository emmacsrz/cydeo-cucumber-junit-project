
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the google search page
    Then user should see title is Google

    #mac command+option+l
  #windows control +option+l

 # @wip  #good idea to use your name for these tags ie: wip_emma
  Scenario: Search result title verification
    Given user is on the google search page
    When user searches for apple
    Then user should see apple in the title

