@ParametreliTest
Feature: US1003 - Parametre ile Stepdefinition Olusturma
  Scenario: TC05 - Parametre Kullanimi
    Given Kullanici Amazon sayfasina gider.
    And Kullanici "iPhone" icin arama yapar.
    Then Kullanici sonuclarin "iPhone" icerdigini test eder.