Feature: US1005 - Positive Login Testi

  @HMC
  Scenario: TC08 Positive Login
    Given Kullanici "hmcURL" sayfasina gider.
    And Kullanici "Login" linkine tiklar.
    Then Kullanici adi olarak "hmcValidUsername" girer.
    And Kullanici sifre olarak "hmcValidPassword" girer.
    And Kullanici Login butonuna basar.
    Then Kullanici basarili giris yapildigini test eder.
    And Kullanici sayfayi kapatir.