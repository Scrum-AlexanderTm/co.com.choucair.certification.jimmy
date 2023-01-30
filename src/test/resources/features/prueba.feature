#Autor: Jimmy Tincopa

  @HistoriaDeUsuario
  Feature: Verificar login session
    @CasoAutenticacionCorrecta
    Scenario: Verificar correcto inicio sesion
      Given Yo ingreso mis credenciales
      When Yo procedo con la autenticacion
      Then Yo veo la pagina principal