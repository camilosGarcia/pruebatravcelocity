@TestFeatureReservaVuelo
Feature: como usuario quiero realizar un viaje aereo

  @TestCaseReservaVuelo
  Scenario: verifico la generacion de checkout de un vuelo
    Given Camilo ingresa a Travelocity
    When se reserva un viaje en avion de menor precio en la fecha actual
    Then se visualiza la pagina de checkout
