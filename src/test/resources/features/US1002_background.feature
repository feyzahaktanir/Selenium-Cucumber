Feature: US1002 - Background ile Amazon Search Testi


  Background: amazon sayfasina gidis
    Given Kullanici Amazon sayfasina gider.

  @us1002 @tc02
  Scenario: TC02 - Amazon Search Testi
    And Kullanici iPhone icin arama yapar.
    Then Kullanici sonuclarin iPhone icerdigini test eder.

  @us1002 @tc03
  Scenario: TC03 - Amazon Search Testi
    And Kullanici tea pot icin arama yapar.
    Then Kullanici sonuclarin tea pot icerdigini test eder.

  @us1002 @tc04
  Scenario: TC04 - Amazon Search Testi
    And Kullanici flower icin arama yapar.
    Then Kullanici sonuclarin flower icerdigini test eder.