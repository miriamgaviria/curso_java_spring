/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.dao.MySQLClienteDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteDAOTest {
    
    private static MySQLClienteDAO daoCli;
    
    @BeforeClass
    public static void setUpClass() {
        daoCli = new MySQLClienteDAO();
        assertNotNull("Error inicialización_DAO", daoCli); 
    }
    
    
    @Test 
    public void clienteBien(){
        assertNotNull(daoCli.insertar(new Cliente(null, "Prueba", "pru@pru.com", (short) 20, "Pru123", (short) 1)));
        assertEquals("pru@gepru.com", daoCli.obtenerUno(1).getEmail()); 
        daoCli.eliminar(1);
        assertNull(daoCli.obtenerUno(1));
    }
    
    @Test 
    public void clienteMal(){
        assertNull(daoCli.insertar(new Cliente(null, "", "pru@pru.com", (short) 20, "Pru123", (short) 1)));
        assertEquals("pru@gepru.com", daoCli.obtenerUno(1).getEmail()); 
        daoCli.eliminar(1);
        assertNull(daoCli.obtenerUno(1));
    }
    
    /* @Test
    public void creandoClientes(){
        daoCli.insertar(new Cliente(1, "Prueba", "pru@pru.com", (short) 20, "Pru123", (short) 1));
        daoCli.insertar(new Cliente(2, "Prueba2", "pru@gepru.com", (short) 20, "Pru123", (short) 1));
        daoCli.insertar(new Cliente(3, "Prueba3", "pru@lepru.com", (short) 20, "Pru123", (short) 1));
        daoCli.insertar(new Cliente(4, "Prueba4", "pru@bepru.com", (short) 20, "Pru123", (short) 1));
        assertEquals(4, daoCli.obtenerTodos().size());
        
        daoCli.insertar(new Cliente(5, "Prueba", "pru@pru.com", (short) 20, "Pru123", (short) 1));//este repetido el mail
        daoCli.insertar(new Cliente(6, null, "pru@nepru.com", (short) 20, "Pru123", (short) 1));//nombre null
        daoCli.insertar(new Cliente(7, "Prueba3", "pru@nepru.com", (short) 20, "Pru123", (short) 3));//activo no es booleano
        daoCli.insertar(new Cliente(8, "Prueba4", "pru@gepru.com", (short) 20, null, (short) 1));//password null
        
    }*/
    
    /*@Test
    public void leyendoClientes(){
        assertEquals(4, daoCli.obtenerTodos().size());   
        assertEquals("pru@gepru.com", daoCli.obtenerUno(3).getEmail()); 
    }*/
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
