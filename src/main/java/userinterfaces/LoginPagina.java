package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPagina {

    public static final Target TXT_USUARIO = Target.the("campo de usuario")
            .locatedBy("//input[@name='Username']");
    public static final Target TXT_CONTRASENA = Target.the("campo de contrasena")
            .locatedBy("//input[@name='Password']");
    public static final Target BTN_LOGIN = Target.the("boton para iniciar sesion")
            .locatedBy("//button[@type='submit']");
}
