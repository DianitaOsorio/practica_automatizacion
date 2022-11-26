package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {
    public static final Target TXT_VALIDACION = Target.the("texto a validar")
            .locatedBy("//h1[contains(text(),'Dashboard')]");
    public static final Target BTN_ORGANIZATION = Target.the("boton organization")
            .locatedBy("//i[@class='s-sidebar-icon fa fa-sitemap premium-feature']");
    public static final Target BTN_BUSSINESS_UNIT = Target.the("boton unidad de negocios")
            .locatedBy("//i[@class='s-sidebar-icon fa fa-sitemap']");
}
