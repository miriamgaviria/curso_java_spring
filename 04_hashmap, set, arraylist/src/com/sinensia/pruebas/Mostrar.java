
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mostrar {
    
    public static void mostrando(){
        /*
        Cliente normal = new Cliente (0, "", null);
        normal.mostrar();
        ClienteInvitado invitado = new ClienteInvitado (0, "Juan", null); 
        invitado.setDuracionMax (10);
        invitado.mostrar();
        ClienteVip unClienteVip = new ClienteVip (5, "María", null);
        unClienteVip.mostrar();
        
        ArrayList <Cliente> listaClientes = new ArrayList (); 
        listaClientes.add(normal); 
        listaClientes.add(invitado); 
        listaClientes.add(unClienteVip); 
        
        /*for (int i = 0; i < listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getIdCliente() + ": " + listaClientes.get(i).getNombreCliente());
        }
        */
        
        ArrayList <Cliente> listaClientes = new ArrayList (); 
        Cliente normal = new Cliente (0, "Juan", null);
        listaClientes.add(normal); 
        ClienteInvitado invitado = new ClienteInvitado (1, "Pedro", null, 13); 
        invitado.setDuracionMax (10);
        listaClientes.add(invitado); 
        
        ClienteVip unClienteVip = new ClienteVip (2, "María", null);
        listaClientes.add(unClienteVip);
        
        for (int i = 0; i < listaClientes.size(); i++){
            //listaClientes.get(i).mostrar();
        }
        
        /*Bucel for each - equivalente al anterior
        for (Cliente cliente : listaClientes){
            cliente.mostrar();
        }*/
        
        HashMap<String, Cliente> mapaClientes;
        mapaClientes = new HashMap<String, Cliente>();
        Cliente Ana = new Cliente (1, "Ana", null);
        Cliente Ada = new Cliente (4, "Ada", null);
        ClienteInvitado Luis = new ClienteInvitado (2, "Luis", null, 15);
        ClienteInvitado Luisa = new ClienteInvitado (5, "Luisa", null, 10);
        ClienteVip Bea = new ClienteVip (3, "Bea", null);
        ClienteVip Juana = new ClienteVip (6, "Juana", null);
        
        //cliente.getNombreCliente() + " - " + cliente.getIdCliente, Ana
        mapaClientes.put("01", Ana); 
        mapaClientes.put("02",Luis); 
        mapaClientes.put("03",Bea);
        mapaClientes.put("04",Ada); 
        mapaClientes.put("05",Luisa); 
        mapaClientes.put("06",Juana);
        
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            cliente.mostrar();
        }
        
        System.out.println("RECORRO HASMAP");
        /*
        System.out.println("Recorro con entryset");
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            String clave = parClaveValor.getKey();
            Cliente valor = parClaveValor.getValue();
            System.out.println("Clave: " + clave);
            valor.mostrar();
        }
        
        mapaClientes.replace("02", normal);
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            cliente.mostrar();
        }
        
        System.out.println("Recorro tras borrar un elemento");
        mapaClientes.remove("06");
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            cliente.mostrar();
        }*/
        
        System.out.println("MODIFICO UN ELEMENTO DESDE SET DEL OBJETO");
        Luisa.setDuracionMax(6);
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            cliente.mostrar();
        }
        
        System.out.println("MODIFICO UN ELEMENTO DESDE HASMAP");
        Cliente clienteAna = mapaClientes.get("02");
        clienteAna.setEmail("ana@gmai.com");
        mapaClientes.get("01").setEmail("ana@gmail.com");
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            cliente.mostrar();
        }
     
        System.out.println("MODIFICO TODOS LOS INVITADOS DEL HASMAP");
        for (Map.Entry<String, Cliente> parClaveValor : mapaClientes.entrySet()){
            Cliente cliente = parClaveValor.getValue();
            if (cliente instanceof ClienteInvitado){
                ((ClienteInvitado) cliente).setDuracionMax(8);
            }
            cliente.mostrar();
        }
        
        /*para crear un hasmap desde un arraylist
        public static ArrayList<Cliente> listaClientes; para convertir el arraylist en globar
        new arrayList para iniciarlo
        creo el hasmap 
        recorro el hasmap y le digo que los elementos de arraylist
            for (Cliente cliente : llstaClietes)¨{
                mapaClientes.put(cliente.getIdCliente() " - " cliente.getNombreCliente, cliente);
            }
        */
    }
}
