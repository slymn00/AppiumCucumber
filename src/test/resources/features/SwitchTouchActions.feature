@switch
Feature:APIDemos
  Background:test sayfasina kadar olan steps
    Given App telefonda acilsin
    When kullanici API demos tiklasin
    Then kullanici Preference tiklasin
    Then kullanici Switch tiklasin

    Scenario:
      And ilk Switch butonu acik olmali
      Then ilk Switch butonunun acik oldugunu onayla

@switch2
    Scenario:  Switch elementler
      And ilk switch butonu kapali olmali
      Then ilk switch butonunun kapali oldugunu onayla
      And ikinci switch butonu acik olmali
      Then ikinci switch butonu acik oldugunu onayla
      And screenshot al
