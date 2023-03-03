Feature: Navegación por sitio Web

  @Smoke
  Scenario: Axeso a la web de gmail a traves del buscardo de google
    Given Como usuario estoy en el inicio de google
    When Como usuaro escribo gmail en el buscador
    Then Como usuario ingeso a la web de gmail

  @Smoke
  Scenario Outline: Ingreso al correo de gmail
    Given Como usuario estoy en la mainpage de gmail
    When Como usuario me redirecciono a la seccion de inicio de session
    And Como usuario ingreso mi <correo>
    Then Como usuario espero al boton siguiente

   Examples:

    |correo|
    |petuto99@gmail.com|