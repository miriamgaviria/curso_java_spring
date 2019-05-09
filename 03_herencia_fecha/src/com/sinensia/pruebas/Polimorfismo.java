
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

public class Polimorfismo {
    public static void polimorfeando(){
        ClienteInvitado invitado = new ClienteInvitado (0, "Juan", null); 
        invitado.setDuracionMax (10);
        //System.out.println("Cliente: " + invitado.getNombreCliente() + ". Duración: " + invitado.getDuracionMax());
        
        //clienteNormal es un objeto tipo ClienteInvitado con la forma de cliente
        Cliente clienteNormal = invitado;
        System.out.println("Nombre: " + clienteNormal.getNombreCliente());
        
        Cliente normal = new Cliente (0, "Tú", null);
        ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
        System.out.println("Nombre: " + normalEnIvit.getDuracionMax());
    }
}
