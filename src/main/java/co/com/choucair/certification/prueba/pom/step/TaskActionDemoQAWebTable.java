package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrlDemoQA;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrlDemoQAWebTable;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TaskActionDemoQAWebTable {
    private PaginaUrlDemoQAWebTable paginaUrlDemoQAWebTable;

    @Step
    public void selectBotonAdd(){
        paginaUrlDemoQAWebTable.btnAdd.click();
    }
    @Step
    public void llenarNombre(){
        paginaUrlDemoQAWebTable.firstName.sendKeys("Jimmy");

    }
    @Step
    public void llenarApellido(){

        paginaUrlDemoQAWebTable.lastName.sendKeys("Tincopa");
    }
    @Step
    public void llenarEmail(){
        paginaUrlDemoQAWebTable.email.sendKeys("jimmy@choucairtesting.com");

    }
    @Step
    public void llenarEdad(){
        paginaUrlDemoQAWebTable.age.sendKeys("29");

    }
    @Step
    public void llenarSalary(){
        paginaUrlDemoQAWebTable.salary.sendKeys("2900");

    }
    @Step
    public void llenarDepartment(){
        paginaUrlDemoQAWebTable.deparment.sendKeys("Lima");

    }
    @Step
    public void clickBtnSubmit(){
        paginaUrlDemoQAWebTable.btnSubmit.click();

    }
    @Step
    public void verificar(){
        assertThat(paginaUrlDemoQAWebTable.lbl_table.isCurrentlyVisible(), is(true));
    }
}
