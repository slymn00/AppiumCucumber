
@popup
Feature: api demos
  Scenario: pop up kontrol
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Views" tiklasin
    When kullanici "Popup Menu" tiklasin
    Then kullanici popup butona tiklasin
    And kullanici pencerenin acildigini onaylasin
    Then kullanici add butonuna tiklasin
    And kullanici gelen popup da "Add" kelimesinin odugunu onaylasin