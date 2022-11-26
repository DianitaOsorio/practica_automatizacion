package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.PaginaPrincipal.TXT_VALIDACION;

public class ValidarElTexto implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_VALIDACION.resolveFor(actor).getText();
    }

    public static Question<String> valor() {
        return new ValidarElTexto();
    }
}
