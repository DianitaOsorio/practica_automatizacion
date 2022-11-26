package tasks;

import net.serenitybdd.core.steps.Instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LoginPagina.*;

public class HacerElLogin implements Task {

    private String usuario;
    private String contrasena;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(contrasena).into(TXT_CONTRASENA),
                Click.on(BTN_LOGIN)
        );
    }

    public static HacerElLogin enElSitio() {
        return Instrumented.instanceOf(HacerElLogin.class).withProperties();
    }

    public HacerElLogin conEsteUsuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public HacerElLogin yEstaContrasena(String contrasena){
        this.contrasena = contrasena;
        return this;
    }
}
