package Model;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contrasenia;
    private boolean administrador;

    public Usuario(int idUsuario, String usuario, String contrasenia, boolean administrador) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public Usuario(String usuario, String contrasenia, boolean administrador) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.administrador = administrador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

}
