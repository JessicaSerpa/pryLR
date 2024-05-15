package modelo;

public class Usuario {
    private int id_usuario;
    private String nom_usuario;
    private String correo;
    private String pass_usuario;
    private String telefono;
    private String direccion;
    private String dni;
    private String tipo_usuario;

    public Usuario() {
    }


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

        public String getCorreo() {
        if (correo != null) {
            int atIndex = correo.indexOf('@');
            if (atIndex != -1) { // Verifica si se encontró el carácter '@'
                return correo.substring(0, atIndex);
            } else {
                // Si no se encuentra el carácter '@', devuelve la cadena original
                return correo;
            }
        } else {
            // Si emp_codigo es nulo, devuelve nulo
            return null;
        }
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}