package serenity.demo.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import drivers.MiAutomata;
import models.DatosDeUsuario;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarElTexto;
import tasks.HacerElLogin;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.GlobalData.ENLACE;


public class LoginStepDefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Diana se encuentra en el sitio web$")
    public void dianaSeEncuentraEnElSitioWeb() {
        MiAutomata.iniciaConEstasOpciones();
        OnStage.theActorCalled("Diana").can(BrowseTheWeb.with(MiAutomata.en(ENLACE)));

    }

    @When("^Diana digita la siguiente informacion$")
    public void dianaDigitaLaSiguienteInformacion(List<DatosDeUsuario> datosDeUsuarioList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HacerElLogin.enElSitio()
                        .conEsteUsuario(datosDeUsuarioList.get(0).getUsuario())
                        .yEstaContrasena(datosDeUsuarioList.get(0).getContrasena())
        );
    }

    @Then("^Diana podra ver el (.*) en el sitio$")
    public void dianaPodraVerElDashboardEnElSitio(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarElTexto.valor(), equalTo(texto)));
    }
}
