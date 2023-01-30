package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaOpenCart;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TaskActionOpenCart {
    private PaginaOpenCart paginaOpenCart;

    @Step
    public void selectProduct(){
        paginaOpenCart.productMac.click();
    }
    @Step
    public void selectBtnAddToCart(){
       paginaOpenCart.btn_addToCar.click();

    }
    @Step
    public void selectBtnViewItems(){

        paginaOpenCart.btn_viewItems.click();
    }
    @Step
    public void selectBtnViewCart(){

        paginaOpenCart.btn_viewCart.click();
    }

    @Step
    public void verificar(){
        assertThat(paginaOpenCart.lbl_table.isCurrentlyVisible(), is(true));
    }
}
