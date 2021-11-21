@firstReusable
Feature: Api demos
  Scenario: reusable method kullanimi
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Preference" tiklasin
    When kullanici "3. Preference dependencies" tiklasin
    When kullanici checkbox tik atsin
    When kullanici "WiFi settings" tiklasin
    And kullanici kutuya yazi gondersin "test"
    Then kullanici OK tiklasin

