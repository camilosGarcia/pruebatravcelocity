@TestFeatureLogin
Feature: como usuario quiero verificar los mensajes de error al realizar el login de forma incorrecta

  @TestCaseLoginClaveErrada
  Scenario: verifico el Login con clave errada
    Given Camilo ingresa a Travelocity
    When el se autentica en la aplicacion con correo electronico y password
      | email |password|
      | |123456|
    Then se visualiza el mensaje Please enter your email address.

  @TestCaseLoginSinEmail
  Scenario: verifico el Login con clave errada
    Given Camilo ingresa a Travelocity
    When el se autentica en la aplicacion con correo electronico y password
      | email |password|
      | login@gmail.com ||
    Then se visualiza el mensaje Please enter your password.

  @TestCaseLoginSinPassword
  Scenario: verifico el Login con clave errada
    Given Camilo ingresa a Travelocity
    When el se autentica en la aplicacion con correo electronico y password
      | email |password|
      | login@gmail.com |123456|
    Then se visualiza la alerta con el mensaje You may have entered an unknown email address or an incorrect password.

