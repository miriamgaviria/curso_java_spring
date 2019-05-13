
package com.sinensia;

public class Cliente {
    protected long idCliente;
    protected String nombreCliente;
    protected String email;
    private boolean activo;
    // private String password;
    // private char genero;
    // String date; fecha, tipo date

    public Cliente(long idCliente, String nombreCliente, String email){ //throws Exception{
        this.idCliente = idCliente;
        /*if (nombreCliente == null || nombreCliente == ""){
            // throw new Exception ("Nombre de cliente inválido");
            System.err.println("Nombre de cliente inválido");
        }*/
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
    
    public void mostrar (){
        System.out.println("Método mostrar de cliente");
        System.out.println("- Cliente " + nombreCliente);
        System.out.println("- Id " + this.idCliente);
        System.out.println("- Email " + this.getEmail());
    }
    
    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Cliente [" + idCliente + ", " + nombreCliente + ", " + email + "]";
    }
}
