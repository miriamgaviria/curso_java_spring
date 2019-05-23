/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
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
public class ClienteUnitTest {
    
    public ClienteUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void probarJUnit(){
        assertEquals(10, 10);
        //assertEquals("texto", "tExto");
        assertNotEquals("texto", "tExto");
    }
    
    @Test
    public void probarClienteDAO(){
        ClienteDAO daoCli = new ClienteDAO();
        daoCli.insertar(new Cliente(1, "Prueba", "pru@pru.com", (short) 20, "Pru123", (short) 1));
        daoCli.insertar(new Cliente(2, "Prueba2", "pru@pru.com", (short) 22, "Pru123", (short) 1));
        assertEquals(daoCli.obtenerTodos().size(), 2);//test para ver si el tamaño de la lista es de dos
        
        Cliente cli = daoCli.obtenerUno(2);
        assertTrue(cli.getEmail().equals("pru@pru.com"));
        assertSame(cli, cli);
        
        
        
    }
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
