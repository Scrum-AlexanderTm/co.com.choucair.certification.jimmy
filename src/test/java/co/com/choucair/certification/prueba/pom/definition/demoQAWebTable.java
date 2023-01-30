package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;
import co.com.choucair.certification.prueba.pom.step.TaskActionDemoQAForm;
import co.com.choucair.certification.prueba.pom.step.TaskActionDemoQAWebTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class demoQAWebTable {
    @Steps
    OpenApp openApp;
    @Steps
    TaskActionDemoQAWebTable taskActionDemoQAWebTable;

    @When("^Yo selecciono boton add$")
    public void yoSeleccionoBotonAdd(){
        openApp.appUrlDemoQAWebTable();
        taskActionDemoQAWebTable.selectBotonAdd();
    }

    @When("^Yo ingreso los datos solicitados para el registro en la tabla$")
    public void yoIngresoLosDatosSolicitadosParaElRegistroEnLaTabla()  {
        taskActionDemoQAWebTable.llenarNombre();
        taskActionDemoQAWebTable.llenarApellido();
        taskActionDemoQAWebTable.llenarEmail();
        taskActionDemoQAWebTable.llenarEdad();
        taskActionDemoQAWebTable.llenarSalary();
        taskActionDemoQAWebTable.llenarDepartment();
        taskActionDemoQAWebTable.clickBtnSubmit();
    }

    @Then("^Yo veo el registro ingresado$")
    public void yoVeoElRegistroIngresado() {

    }


}
