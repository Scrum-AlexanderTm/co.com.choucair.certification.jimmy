#Autor: Jimmy Tincopa

@HistoriaDeUsuario2
Feature: Llenar registro en tabla
  @CasoAutenticacionCorrecta
  Scenario: Verificar registro correcto en la tabla
    Given Yo ingreso a la pagina web
    When Yo selecciono boton add
    And Yo ingreso los datos solicitados para el registro en la tabla
    Then Yo veo el registro ingresado