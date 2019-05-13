
package com.sinensia;

import com.sinensia.dao.GenericoDAO;

public class Cliente extends Entidad{
    
    protected String nombre;
    protected String email;
    private boolean activo;
    // private String password;
    // private char genero;
    // String date; fecha, tipo date

    public Cliente(long id, String nombre, String email){ //throws Exception{
        super(id);
        this.nombre = nombre;
        this.email = email;
        activo = true;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCliente) {
        this.nombre = nombreCliente;
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
        System.out.println("- Cliente " + nombre);
        System.out.println("- Id " + this.id);
        System.out.println("- Email " + this.getEmail());
    }
    
    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Cliente [" + id + ", " + nombre + ", " + email + "]";
    }
}
