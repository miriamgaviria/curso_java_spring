
package pkg02_colecciones;

public class Cliente {
    private long idCliente;
    private String nombreCliente;
    private String email;
    private boolean activo;
    // private String password;
    // private char genero;
    // String date; fecha, tipo date

    public Cliente(long idCliente, String nombreCliente, String email) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.email = email;
        activo = true;
    }
    
    public long getIdCliente (){
        return this.idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
     
}
