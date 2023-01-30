package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;

import co.com.choucair.certification.prueba.pom.step.TaskActionDemoQAForm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class demoQATexBox {

    @Steps
    OpenApp openApp;
    @Steps
    TaskActionDemoQAForm taskActionDemoQAForm;
    @Given("^Yo ingreso a la pagina web$")
    public void yoIngresoALaPaginaWeb()  {
        openApp.appUrlDemoQA();
    }

    @When("^Yo ingreso mi nombre completo$")
    public void yoIngresoMiNombreCompleto(){
        taskActionDemoQAForm.llenarNombre();
    }

    @When("^Yo ingreso mi email$")
    public void yoIngresoMiEmail()  {
        taskActionDemoQAForm.llenarEmail();
    }

    @When("^Yo ingreso mi direccion$")
    public void yoIngresoMiDireccion() {
        taskActionDemoQAForm.llenarCurrentAdd();
    }

    @When("^Yo ingreso mi residencia$")
    public void yoIngresoMiResidencia() {
        taskActionDemoQAForm.llenarPermantAdd();
    }

    @When("^Yo selecciono botón submit$")
    public void yoSeleccionoBotónSubmit() {
        taskActionDemoQAForm.clickBtnSubmit();
    }

    @Then("^Yo veo los datos enviados$")
    public void yoVeoLosDatosEnviados(){
        taskActionDemoQAForm.verificar();
    }


}
