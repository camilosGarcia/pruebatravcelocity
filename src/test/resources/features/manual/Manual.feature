@TestFeatureLogin
Feature: como usuario quiero verificar registrarme en Travelocity

  @TestCaseRegistroUsuario
  Scenario: registro de un nuevo usuario
    Given Camilo ingresa a Travelocity
    When el ingresa sus datos correctamente
    Then se visualiza el mensaje de registro exitoso.

  @TestCaseRegistroUsuarioYaRegistrado
  Scenario: registro de un nuevo ya registrado
    Given Camilo ingresa a Travelocity
    When el ingresa sus datos previamente registrados
    Then se visualiza el mensaje el usuario ya existe.

  @TestCaseRegistroUsuarioDeFacebook
  Scenario: registro de un nuevo usuario
    Given Camilo ingresa a Travelocity
    When el ingresa los datos de su cuenta de facebook
    Then se visualiza el mensaje de registro exitoso.

  @TestCaseRegistroUsuarioDeApple
  Scenario: registro de un nuevo usuario
    Given Camilo ingresa a Travelocity
    When el ingresa los datos de su cuenta de apple
    Then se visualiza el mensaje de registro exitoso.

  @TestFeatureReservaVuelo
  Feature: como usuario quiero verificar el calculo de los precios

  @TestCaseRegistroUsuario
  Scenario: verifico el calculo del precio total
    Given Camilo ingresa a Travelocity
    When el reserva un viaje en avion
    Then se verifica que el precio total sea el correcto

  @TestFeatureReservarHotel
  Feature: como usuario quiero verificar el calculo de los precios

  @TestCaseIncrementoViajeros
  Scenario: verifico el incremento del numero de viajeros
    Given Camilo ingresa a Travelocity
    When modifica los datos de los viajeros de manera ascendete en el registro del hotel
    Then se visualiza el aumento de la cantidad de viajeros.

  @TestCaseDecrementoViajeros
  Scenario: verifico el decrementodel numero de viajeros
    Given Camilo ingresa a Travelocity
    When modifica los datos de los viajeros de manera descendente en el registro del hotel
    Then se visualiza el aumento de la cantidad de viajeros.

  @TestCaseReservaHotel
  Scenario: verifico la reserva de hotel
    Given Camilo ingresa a Travelocity
    When se reserva un hotel
    Then se visualiza el mensaje de registro de estadia en el hotel exitoso.

  @TestCaseReservaHotelAutomovil
  Scenario: verifico la reserva de hotel y automovil
    Given Camilo ingresa a Travelocity
    When el reserva un hotel
    And reserva un automovil
    Then se visualiza el mensaje de registro de estadia en el hotel y automovil exitoso.

  @TestCaseReservaHotelVuelo
  Scenario: verifico la reserva de hotel y vuelo
    Given Camilo ingresa a Travelocity
    When el reserva un hotel
    And reserva un vuelo
    Then se visualiza el mensaje de registro de estadia en el hotel y vuelo exitoso.

  @TestCaseReservaHotelVueloFallido
  Scenario: verifico la reserva de hotel y vuelo fallido
    Given Camilo ingresa a Travelocity
    When el reserva un hotel
    And reserva un vuelo con mismo destino y origen
    Then se visualiza el mensaje de error.

  @TestCaseReservaHotelAutomovilVuelo
  Scenario: verifico la reserva de hotel, vuelo y automovil
    Given Camilo ingresa a Travelocity
    When el reserva un hotel
    And reserva un vuelo
    And reserva un automovil
    Then se visualiza el mensaje de registro de estadia en el hotel, vuelo y automovil exitoso.

  @TestFeatureAlquilerAutomovil
  Feature: como usuario quiero verificar el calculo de los precios

  @TestCaseIncrementoViajeros
  Scenario: verifico el incremento del numero de viajeros
    Given Camilo ingresa a Travelocity
    When se reserva un viaje en automovil
    Then se visualiza el mensaje de alquiler de auto exitoso.

  @TestCaseIncrementoViajeros
  Scenario: verifico el incremento del numero de viajeros
    Given Camilo ingresa a Travelocity
    When se reserva un viaje en automovil con el mismo origen y destino
    Then se visualiza el mensaje de error.