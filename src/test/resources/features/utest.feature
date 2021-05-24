#Autor: Jean Sousa
  @stories
  Feature: Regiter On utest.com
    As a user, i want to register on Utest.com
  @scenario
  Scenario: Register On utest.com
    Given I enter to ustest website
    When I Type my personale information and complete the setup
    |firstName|lastName|email            |month|day|year|language |city    |postal|country|computer|version  |mobil|model   |system    |password     |question|
    |Juan     |Arias   |j.arias@gmail.com|June |12 |1992|Albanian |Veracruz|507   |Panama |Windows |Windows 8|Apple|iPhone 4|iOS 11.1.1|Choucair2021*|Complete Setup|
    Then I Sig up on the utest.