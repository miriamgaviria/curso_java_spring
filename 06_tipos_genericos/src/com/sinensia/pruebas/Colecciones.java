
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author Admin
 */
public class Colecciones {
    public static void ejemploHashMap(){
        HashMap<String, Cliente> diccionarioClientes = new HashMap<String, Cliente>();
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
        
        Map<Date, Cliente> mapClienteFecha = new TreeMap<Date, Cliente>();
        mapClienteFecha.put(new Date (1982, 4, 9), luis);
        mapClienteFecha.put(new Date (1981, 5, 10), new Cliente(7, "Fulano","fff@gmail.com"));
        mapClienteFecha.put(new Date (1983, 6, 11), new Cliente(8, "Rosa","rosa@gmail.com"));
        mapClienteFecha.put(new Date (1980, 7, 12), diccionarioClientes.get("c3"));
        
        System.out.println ("TREE MAP CON CLAVE FECHA");
        for (Map.Entry<Date, Cliente> entrada : mapClienteFecha.entrySet()){
            System.out.println ("Clave: " + entrada.getKey().toString());
            System.out.println ("Cliente: " + entrada.getValue().toString());
        }
    }
    
    public static void ejemploListas (){
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
        
        System.out.println ("Añado dos clientes iguales");
        listaClientes.add(new Cliente (4, "Juan", null)); 
        listaClientes.add(new Cliente (4, "Juan", null)); 
        for (Cliente cliente : listaClientes){
            System.out.println("Cliente: " + cliente.getNombreCliente());
        }
    }
    
    public static void ejemploSet (){
        //conjunto de elementos únicos
        HashSet <Cliente> conjuntoClientes = new HashSet ();
        conjuntoClientes.add (new Cliente (1, "Ada", null));
        conjuntoClientes.add (new Cliente (2, "José", null));
        Cliente clientePepe = new Cliente (3, "Pepe", null);
        conjuntoClientes.add (clientePepe);
        conjuntoClientes.add (clientePepe);
        
        // Tres formas de recorrer el set
        // For each
        for (Cliente cli : conjuntoClientes){
            cli.mostrar();
        }
        
        // For + iterator que crea Netbeans
        /*for (Iterator<Cliente> it = conjuntoClientes.iterator(); it.hasNext();) {
            Cliente cli = it.next();
            cli.mostrar();
        }
        
        //Iterator
        Iterator <Cliente> iter = conjuntoClientes.iterator();
        while (iter.hasNext()){
            Cliente cli = iter.next();
            cli.mostrar();
        }*/
    }
}
