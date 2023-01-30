#Autor: Jimmy Tincopa

@HistoriaDeUsuario1
Feature: Verificar Formulario
  @CasoAutenticacionCorrecta
  Scenario: Verificar Formulario
    Given Yo ingreso a la pagina web
    When Yo ingreso mi nombre completo
    And Yo ingreso mi email
    And Yo ingreso mi direccion
    And Yo ingreso mi residencia
    And Yo selecciono botón submit
    Then Yo veo los datos enviados