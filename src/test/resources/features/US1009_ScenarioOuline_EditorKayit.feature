Feature: US1009 - Scenario Outline ile EditorKayit Testi

  @editor
  Scenario Outline: TC14 - Kullanici yeni kayit ekleyebilmeldir.
    Given Kullanici "editorURL" sayfasina gider.
    Then new butonuna tiklar
    And firstname olarak "<firstname>" yazar.
    And lastname olarak "<lastname>" yazar.
    And position olarak "<position>" yazar.
    And office olarak "<office>" yazar.
    And extension olarak "<extension>" yazar.
    And start olarak "<start>" yazar.
    And salary olarak "<salary>" yazar.
    And Create tusuna basar.
    When Kullanici "<firstname>" ile arama yapar.
    Then isim bolumunde "<firstname>" oldugunu dogrular.
    And Kullanici sayfayi kapatir.

    Examples:
    |firstname|lastname|position|office|extension|start|salary|
    |feyza   |kuru   |tester  |hollanda|tester |2022-02-05|200|