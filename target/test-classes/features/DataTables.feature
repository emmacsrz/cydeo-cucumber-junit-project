Feature: Cucumber data tables implementation practice


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

  #create a new scenario where we list the type of pets we love and print out the strings in the list


  Scenario: list of pet types I love
    Then  I will share my favorites
      | Australian Shepherds |
      | Golden Retrievers    |
      | Cats                 |


  Scenario: officer reads data about driver
    Then officer is able to read any data he wants
      | name    | jane       |
      | surname | doe        |
      | age     | 30         |
      | address | somewhere  |
      | state   | CA         |
      | zip     | 000000     |
      | phone   | 1231231234 |

@DataTables
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
