package tasks;

import interactions.SeleccionarOpcionDeLista;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaBussiness.*;
import static userinterfaces.PaginaPrincipal.*;

public class CrearUnidadDeNegocios implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ORGANIZATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ORGANIZATION),
                Click.on(BTN_BUSSINESS_UNIT),
                Click.on(BTN_NEW_BUSSINESS_UNIT),
                Enter.theValue("Qvision").into(TXT_NOMBRE_UNIDAD),
                Click.on(TXT_LISTA),
                SeleccionarOpcionDeLista.enElSitio(LST_UNIDAD, "Administration"),
                Click.on(BTN_SAVE)

        );
    }

    public static CrearUnidadDeNegocios enElSitio(){
        return Instrumented.instanceOf(CrearUnidadDeNegocios.class).withProperties();
    }
}
