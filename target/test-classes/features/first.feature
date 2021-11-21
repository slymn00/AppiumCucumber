@first
  Feature: API Demos
    Scenario: API Demos01

      Given App telefonda acilsin
      When kullanici API demos tiklasin
      When kullanici Preference tiklasin
      When kullanici Preference Dependencies tiklasin
      And kullanici checkbox tik atsin
      When kullanici WiFi settings tiklasin
      And kullanici kutuya yazi gondersin "test"
      Then kullanici OK tiklasin