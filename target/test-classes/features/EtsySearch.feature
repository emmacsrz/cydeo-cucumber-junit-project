Feature: Etsy Search Functionality
  Agile Story:  User hould be able to type any keyword and see relevant information
@EtsyTitleVerification1
  Scenario: Etsy Title Verification
    Given user is on the Etsy homepage
    Then user should see title is as expected
    #expectedTitle:  Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @EtsyTitleVerification2
  Scenario: Etsy Title Verification (Without parameterization)
    Given user is on the Etsy homepage
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user should see Wooden Spoon in the title

  @EtsyTitleVerification3
  Scenario: Etsy Title Verification (Without parameterization)
    Given user is on the Etsy homepage
    When user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user should see "Wooden spoon - Etsy" in the Etsy title

