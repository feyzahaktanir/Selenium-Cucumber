Feature: US1006 - Negative Login Testi

  @HMCnegative
  Scenario: TC09 Negative Login
    Given Kullanici "hmcURL" sayfasina gider.
    And Kullanici Login linkine tiklar.
    Then Kullanici adi olarak "hmcWrongUsername" girer.
    And Kullanici sifre olarak "hmcValidPassword" girer.
    And Kullanici Login butonuna basar.
    Then Kullanici giris yapilmadigini test eder.
    And Kullanici sayfayi kapatir.

  Scenario: TC10 Dogru Username, yanlis Password ile giris yapilamaz.
    Given Kullanici "hmcURL" sayfasina gider.
    Then Kullanici Login linkine tiklar.
    And Kullanici adi olarak "hmcValidUsername" girer.
    And Kullanici sifre olarak "hmcWrongPassword" girer.
    And Kullanici Login butonuna basar.
    Then Kullanici giris yapilmadigini test eder.
    And Kullanici sayfayi kapatir.

  Scenario: TC11 Yanlis Username, yanlis Password ile giris yapilamaz.
    Given Kullanici "hmcURL" sayfasina gider.
    Then Kullanici Login linkine tiklar.
    And Kullanici adi olarak "hmcWrongUsername" girer.
    And Kullanici sifre olarak "hmcWrongPassword" girer.
    And Kullanici Login butonuna basar.
    Then Kullanici giris yapilmadigini test eder.
    And Kullanici sayfayi kapatir.
