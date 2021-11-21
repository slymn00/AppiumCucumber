@dragdrop
Feature:Api demos
  Scenario: drag and drop test
    Given App telefonda acilsin
    When kullanici API demos tiklasin
    When kullanici Views tiklasin
    Then kullanici drag and drop tiklasin
    And kullanici ilk noktayi alip ucuncu noktaya tasiyacak
    And cikan yaziyi onaylayacak