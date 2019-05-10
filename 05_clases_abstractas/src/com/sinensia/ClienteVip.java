
package com.sinensia;

public class ClienteVip extends Cliente {
    
    public ClienteVip(long idCliente, String nombreCliente, String email) {
        super(idCliente, nombreCliente, email);
    }
    
    private String beneficio = "Superhabit";

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String Beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public void mostrar (){
        System.out.println("Método mostrar de clienteVip");
        System.out.println("- Cliente " + nombreCliente);
        System.out.println("- Id " + this.idCliente);
        System.out.println("- Email " + this.getEmail());
        System.out.println("- Beneficio " + beneficio);
    }
}
