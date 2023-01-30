package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;

import co.com.choucair.certification.prueba.pom.step.TasksAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginDefinition {

    @Steps
    OpenApp openApp;
    @Steps
    TasksAction tasksAction;

    @Given("^Yo ingreso mis credenciales$")
    public void yoIngresoMisCredenciales() {
        openApp.appUrl();
    }

    @When("^Yo procedo con la autenticacion$")
    public void yoProcedoConLaAutenticacion() {
        tasksAction.singIn();
    }

    @Then("^Yo veo la pagina principal$")
    public void yoVeoLaPaginaPrincipal() {
        tasksAction.verificar();
    }
}
