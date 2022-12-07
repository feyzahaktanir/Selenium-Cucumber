@ParametreliURL
Feature: US1004 - Parametre ile istenen sayfaya gitme

  Scenario: TC06 - Eski usul Amazon'a gitme
    Given Kullanici Amazon sayfasina gider.
    # Then Kullanici techproeducation sayfasina gider.
    And Kullanici sayfayi kapatir.

  Scenario: TC07 - Parametre ile istenen sayfaya gitme
    Given Kullanici "BestBuyURL" sayfasina gider.
    And Kullanici sayfayi kapatir.