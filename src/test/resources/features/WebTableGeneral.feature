Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

    Scenario: payment options verification
      Given user is already logged in to The Web table app
      When user is on the Order page
      Then user sees Visa as enabled payment option
      Then user sees MasterCard as enabled payment option
      Then user sees American Express as enabled payment option