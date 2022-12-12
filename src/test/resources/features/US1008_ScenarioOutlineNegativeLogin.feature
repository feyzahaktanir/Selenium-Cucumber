Feature: US1008 - Scenario Outline kullanarak farkli degerlerle negative login testi
  @scOutline
  Scenario Outline: TC13 - Farkli username ve password
    Given Kullanici "hmcURL" sayfasina gider.
    And Kullanici Login linkine tiklar.
    Then Kullanici username olarak "<username>" girer.
    And Kullanici password olarak "<password>" girer.
    And Kullanici Login butonuna basar.
    Then Kullanici giris yapilmadigini test eder.
    And Kullanici sayfayi kapatir.

    Examples:
    |username|password|
    |MANAGER|MANAGER1|
    |manager|manager1|
    |MANager|MANager1|
    |Man ager|Man ager1|
