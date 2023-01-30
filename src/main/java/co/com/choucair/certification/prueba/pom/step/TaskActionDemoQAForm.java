package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrlDemoQA;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TaskActionDemoQAForm {
    private PaginaUrlDemoQA paginaUrlDemoQA;

    @Step
    public void llenarNombre(){
        paginaUrlDemoQA.fullName.sendKeys("Jimmy Tincopa");

    }
    @Step
    public void llenarEmail(){
        paginaUrlDemoQA.email.sendKeys("jimmy@choucairtesting.com");
    }
    @Step
    public void llenarCurrentAdd(){
        paginaUrlDemoQA.currentAdd.sendKeys("jiron elias aguirre 123");

    }
    @Step
    public void llenarPermantAdd(){
        paginaUrlDemoQA.permantAdd.sendKeys("av javier prado 123");

    }
    @Step
    public void clickBtnSubmit(){
        paginaUrlDemoQA.btnSubmit.click();

    }
    @Step
    public void verificar(){
        assertThat(paginaUrlDemoQA.lbl_menu.isCurrentlyVisible(), is(true));
    }
}
