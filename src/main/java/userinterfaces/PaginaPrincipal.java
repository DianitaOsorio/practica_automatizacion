package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {
    public static final Target TXT_VALIDACION = Target.the("texto a validar")
            .locatedBy("//h1[contains(text(),'Dashboard')]");
}
