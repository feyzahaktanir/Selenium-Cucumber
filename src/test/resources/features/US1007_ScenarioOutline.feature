Feature: US1007 - ScenarioOutline ile Amazon Search
  Scenario Outline: TC12 - Amazon'da bir listedeki tüm elementleri aratma
    Given Kullanici "AmazonURL" sayfasina gider.
    Then Kullanici "<searchWord>" icin arama yapar.
    And Kullanici sonuclarin "<searchWord>" icerdigini test eder.
    Then Kullanici sayfayi kapatir.

    Examples:
    |searchWord|
    |Apple|
    |Java|
    |Armut|
    |Samsung|
    |Nutella|