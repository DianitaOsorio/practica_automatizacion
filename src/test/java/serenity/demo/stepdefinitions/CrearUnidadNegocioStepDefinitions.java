package serenity.demo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.CrearUnidadDeNegocios;

public class CrearUnidadNegocioStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^accede a nueva unidad de negocios$")
    public void accedeANuevaUnidadDeNegocios() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUnidadDeNegocios.enElSitio());
    }


    @Then("^podra ver la unidad de negocios creada$")
    public void podraVerLaUnidadDeNegociosCreada() {
        //TAREA PARA MAÑANA SABADO
    }


}
