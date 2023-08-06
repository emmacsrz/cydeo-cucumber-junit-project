Feature: Order placing scenario

  Scenario:
    Given user is already logged in to The Web table app
    When user is on the Order page
    And user enters quantity "2"
    Then user clicks to the calculate button
    And user enters customer name "Jane Doe"
    And user enters street "Sesame Street"
    And user enters city "New York"
    And user enters state "New York"
    And user enters zip "123456"
    And user selects payment option "MasterCard"
    And user enters credit card number "1111222233331234"
    And user enters expiration date "03/24"
    And user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table

  @wip
  Scenario Outline:
    Given user is already logged in to The Web table app
    When user is on the Order page
    And user enters quantity "<quantity>"
    Then user clicks to the calculate button
    And user enters customer name "<CustomerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "zip"
    And user selects payment option "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expirationDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table


    Examples:
      | quantity | CustomerName | street        | state    | city     | zip    | cardType   | cardNumber       | expirationDate | expectedName |
      | 2        | John Doe     | Sesame Street | New York | New York | 123456 | MasterCard | 1111222233331234 | 03/24          | John Doe     |
      | 2        | Jane Doe     | Sesame Street | New York | New York | 123456 | MasterCard | 1111222233331234 | 03/24          | Jane Doe     |
      | 2        | Jane Doe     | Sesame Street | New York | New York | 123456 | MasterCard | 1111222233331234 | 03/24          | Jane Doe     |