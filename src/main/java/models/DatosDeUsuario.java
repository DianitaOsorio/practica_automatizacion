package models;

public class DatosDeUsuario {

    private String usuario;
    private String contrasena;

    public DatosDeUsuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contrasena = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
