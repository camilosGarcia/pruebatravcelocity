@TestFeatureLogin
Feature: como usuario quiero iniciar sesion en Travelocity

  @TestCaseLoginCorrecto
  Scenario: verifico el Login con clave errada
    Given Camilo ingresa a Travelocity
    When el se autentica en la aplicacion con correo electronico y password
      | email |password|
      | pruebatecnicadevco@gmail.com|devco123|
    Then se visualiza el nombre del usuario logueado
      |name|
      |camilo|


