package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarOpcionDeLista implements Interaction {

    private final Target elemento;
    private final String opcion;

    public SeleccionarOpcionDeLista(Target elemento, String opcion) {
        this.elemento = elemento;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement objecto = elemento.resolveFor(actor);
        List<WebElement> dropDownList = objecto.findElements(By.tagName("li"));
        for (WebElement i:dropDownList) {
            if (i.getText().contains(opcion)){
                i.click();
                break;
            }
        }

    }

    public static SeleccionarOpcionDeLista enElSitio(Target elemento, String opcion){
        return Instrumented.instanceOf(SeleccionarOpcionDeLista.class).withProperties(elemento, opcion);
    }
}
