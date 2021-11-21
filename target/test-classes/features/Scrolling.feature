@scrollswitch
Feature: Api Demos
  Background:
    Given App telefonda acilsin
    When kullanici API demos tiklasin
    When kullanici Views tiklasin

  Scenario: scroll to element and click
    Then kullanici Switches tiklasin

  @single
  Scenario: UiScrollable ile
    Then kullanici UiScrollable ile Switches tiklasin

  @WebView
  Scenario: UIscrollable ile
    Then  kullanici UiScrolable ile "WebView" tiklasin
