package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaBussiness {
    public static final Target BTN_NEW_BUSSINESS_UNIT = Target.the("boton nueva unidad")
            .locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target TXT_NOMBRE_UNIDAD = Target.the("campo para nombre de unidad")
            .locatedBy("//div[@class='field Name']//input[@name='Name']");
    public static final Target LST_UNIDAD = Target.the("lista desplegable")
            .locatedBy("//ul[@class='select2-results']");
    public static final Target TXT_LISTA = Target.the("objecto que despliga la lista")
            .locatedBy("//div[@class='field ParentUnitId']//div");
    public static final Target BTN_SAVE = Target.the("boton para guardar")
            .locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

}
