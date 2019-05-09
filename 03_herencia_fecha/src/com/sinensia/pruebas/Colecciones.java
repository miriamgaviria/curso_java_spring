/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Colecciones {
    static void ejemploHashMap(){
        HashMap<String, Cliente> diccionarioClientes;
        diccionarioClientes = new HashMap<String, Cliente>();
        Cliente ana = new Cliente (1, "Ana", null);
        Cliente luis = new Cliente (2, "Luis", null);
        Cliente bea = new Cliente (3, "Bea", null);
        
        diccionarioClientes.put("a1", ana);
        diccionarioClientes.put("b2", luis);
        diccionarioClientes.put("c3", bea);
        
        System.out.println("Nombre de c3: " + diccionarioClientes.get("c3").getNombreCliente());
        
        if(! diccionarioClientes.containsKey("c3")){
            diccionarioClientes.put("c3", new Cliente(4, "Pedro", null));
        }
        System.out.println("No se ha podido introducir el cliente" );
        System.out.println("Nombre de c3: " + diccionarioClientes.get("c3").getNombreCliente());
        
        System.out.println("Recorro con for each" );
        for (Map.Entry<String, Cliente> parClaveValor : diccionarioClientes.entrySet()){
            System.out.println ("Cliente: " + parClaveValor.getKey());
            Cliente cliente = parClaveValor.getValue();
            System.out.println ("Nombre: " + cliente.getNombreCliente());
        }
    }
    
    static void ejemploListas (){
        ArrayList <Cliente> listaClientes;
        listaClientes = new ArrayList (); 
        listaClientes.add(new Cliente (1, "Ana", null)); 
        listaClientes.add(new Cliente (2, "Pedro", null)); 
        listaClientes.add(new Cliente (3, "Luis", null)); 
        
        for (int i = 0; i < listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getIdCliente() + ": " + listaClientes.get(i).getNombreCliente());
        }
        
        listaClientes.remove(0);
        System.out.println ("Elemento borrado");
        listaClientes.add(0, new Cliente (1, "Bea", null));
        System.out.println ("Elemento añadido en la misma posición");
        
        for (int i = 0; i < listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getIdCliente() + ": " + listaClientes.get(i).getNombreCliente());
        }
        
        Cliente Luis = listaClientes.get(2);
        Luis.setEmail("luis@gmail.com");
        System.out.println ("Email añadido a elemento");
        
        for (int i = 0; i < listaClientes.size(); i++){
            System.out.println("Cliente " + listaClientes.get(i).getIdCliente() + ": " + listaClientes.get(i).getNombreCliente()
            + " Email: " + listaClientes.get(i).getEmail());
        }
        
        System.out.println ("Recorro lista con for each");
        for (Cliente cliente : listaClientes){
            System.out.println("Cliente: " + cliente.getNombreCliente());
        }
    }
}
