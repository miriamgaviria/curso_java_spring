
package com.sinensia;


public class ClienteInvitado extends Cliente {
    private int duracionMax;
    
    public ClienteInvitado(long idCliente, String nombreCliente, String email, int duracionMax) {
        super(idCliente, nombreCliente, email);
        this.duracionMax = duracionMax;
    }
    
    public ClienteInvitado(long idCliente, String nombreCliente, String email) {
        super(idCliente, nombreCliente, email);
    }

    
    public int getDuracionMax() {
        return duracionMax;
    }

    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }
    
    // métodos virtuales: cuando se sobreescribe un método, se coge el del hijo (da igual que se ponga Override)
    /*@Override
    public void mostrar (){
        System.out.println("Cliente " + nombreCliente);
        System.out.println(". Id " + this.idCliente);
        System.out.println(". Email " + this.getEmail());
        System.out.println(". Duración máxima " + this.duracionMax);
    }*/
    
    //siguiente código igual al anterior
    @Override
    public void mostrar (){
        System.out.println("Método mostrar de clienteInvitado");
        System.out.println("- Cliente " + nombre);
        System.out.println("- Id " + this.id);
        System.out.println("- Email " + this.getEmail());
        System.out.println("- Duración máxima " + this.duracionMax);
    }
}
