/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.logica.ServicioClientes;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.sinensia.modelo.logica.*;


/**
 *
 * @author Admin
 */
public class ClienteServicioTest {
    private static ServicioClientes serviCli ;
    
   
    @BeforeClass
    public static void setUpClass() {
        serviCli = new ServicioClientes();
    }
    
    @Test
    public void clienteOk(){
        // assert = afirmar / asegúrate
        assertNotNull(serviCli.insertar("Uno", "email@ok.com", "ok12", "30", "on"));
        //serviCli.insertar("Dos", "email2@ok.com", "ok12", "30", "on");
        assertEquals(serviCli.obtenerUno("email@ok.com").getNombre(), "Uno");
        //assertEquals(serviCli.obtenerUno("email2@ok.com").getNombre(), "Dos");
        serviCli.eliminar("email@ok.com");
        //serviCli.eliminar("email2@ok.com");
        //assertNull(serviCli.obtenerUno("email@ok.com"));
        //assertNull(serviCli.obtenerUno("email2@ok.com"));
    }
    
    
    @Test
    public void clienteMal_Nombre(){
        serviCli.insertar("", "email@ok1.com", "ok12", "30", "on");
        assertNull(serviCli.obtenerUno("email@ok1.com"));
    }
    
    @Test
    public void clienteMal_OtrosCampos(){
        serviCli.insertar("Nombre bien", "", "ok12", "30", "on");// mail null
        serviCli.insertar("Bien", "email@oka.com", "", "30", "on");//passwd null
        serviCli.insertar("Ok", "email@okb.com", "ok12", "0", "on");//edad null
        serviCli.insertar("Ok", "email@okc.com", "ok12", "NoNum", "on");//edad no numérico
        assertNull(serviCli.obtenerUno(""));
        assertNull(serviCli.obtenerUno("email@oka.com"));
        assertNull(serviCli.obtenerUno("email@okb.com"));
        assertNull(serviCli.obtenerUno("email@okc.com"));
    }
    
    @Test
    public void modificarOK(){
        assertNotNull(serviCli.insertar("Ana", "ana@ok.com", "ok12", "30", "on"));
        /* esto es igual a las siguientes 4 líneas de código
        assertNotNull(serviCli.modificar(serviCli.obtenerUno("ana@ok.com").getId(), "Ana2", "ana@ok.com", "ok12", "30", "on"));
        */
        Cliente cliente = serviCli.obtenerUno("ana@ok.com");
        serviCli.modificar(cliente.getId(),"Ana2", "ana@ok.com", "ok12", "30", "on");
        cliente = serviCli.obtenerUno("ana@ok.com");
        assertEquals(cliente.getNombre(), "Ana");
        serviCli.eliminar("ana@ok.com");
        //assertNull(serviCli.obtenerUno("ana@ok.com"));
    }
    
    @Test
    public void modificarMal(){
        assertNotNull(serviCli.insertar("Ana", "ana@ok.com", "ok12", "30", "on"));
        assertNull(serviCli.modificar(serviCli.obtenerUno("ana@ok.com").getId(), "Ana2", "ana@ok.com", "", "30", "on")); 
        /* La línea anterior es igual a esto
        Cliente cliente = serviCli.obtenerUno("ana@ok.com");
        assertEquals(cliente.getNombre(), "Ana2");
        serviCli.elimiinar ("ana@ok.com");
        assertNull(serviCli.obtenerUno("ana@ok.com"));
       */
    }

}
