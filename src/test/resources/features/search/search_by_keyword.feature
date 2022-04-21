Feature: Search by keyword


  @Regression
 Scenario: Searching for a term
    Given Serena is researching things on the internet
    When she looks up "Cucumber"
   Then she should see information about "Cucumber"


    Scenario: Search in google
      Given I open a browser with google
      When I search for "my course with bdd"
      Then I should get results

