Feature: Google search


  Scenario: Search in google
    Given I open a browser with google
    When I search for "my course with bdd"
    Then I should get results
    And sadsadsad