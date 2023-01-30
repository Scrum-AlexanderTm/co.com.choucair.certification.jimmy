#Autor: Jimmy Tincopa

@HistoriaDeUsuario3
Feature: Realizar la compra de un articulo de computo
  @CasoLlenarForumalrio
  Scenario: Verificar que el producto de añada al carrito de compras
    Given Yo ingreso a la pagina web
    When Yo selecciono el producto, lo añado al carrito de compras y selecciono el item del carrito de compras
    Then Yo veo el producto añadido al carrito