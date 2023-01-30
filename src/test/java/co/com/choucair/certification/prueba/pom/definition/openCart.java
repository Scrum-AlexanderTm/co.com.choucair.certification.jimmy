package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;

import co.com.choucair.certification.prueba.pom.step.TaskActionOpenCart;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class openCart {
    @Steps
    OpenApp openApp;
    @Steps
    TaskActionOpenCart taskActionOpenCart;

    @When("^Yo selecciono el producto, lo añado al carrito de compras y selecciono el item del carrito de compras$")
    public void yoSeleccionoElProductoLoAñadoAlCarritoDeComprasYSeleccionoElItemDelCarritoDeCompras()  {
        openApp.appUrlOpenCart();
        taskActionOpenCart.selectProduct();
        taskActionOpenCart.selectBtnAddToCart();
        taskActionOpenCart.selectBtnViewItems();
        taskActionOpenCart.selectBtnViewCart();
    }

    @Then("^Yo veo el producto añadido al carrito$")
    public void yoVeoElProductoAñadidoAlCarrito()  {
        taskActionOpenCart.verificar();
    }
}
