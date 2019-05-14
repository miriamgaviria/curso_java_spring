/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin - Miriam
 */
public class ProbandoDAO {
    public static void probarCliente(){
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aaa@gmail.com"));
        repoCli.poner(new ClienteInvitado(2, "Juan", "juan@gmail.com")); 
        repoCli.poner(new ClienteInvitado(3, "Bea", "bea@gmail.com")); 
        Cliente Pedro = new Cliente(1, "Pedro", "peddro@gmail.com");
        System.out.println("Juan: " + repoCli.leerUno(2).toString());
        System.out.println(repoCli.leerUno(3).toString());
        System.out.println(repoCli.leerTodos());
        //repoCli.modificar(Pedro);
        System.out.println(repoCli.leerTodos());
        
        /*repoCli.modificar(new Cliente (3, "Eva", "eva@gmail.com"));
        Cliente cli = repoCli.leerUno(3);
        System.out.println("Cliente normal, leído y modificado por invitado: " + cli.toString());
        
        repoCli.modificar(new ClienteInvitado (1, "Ana2", "ana2@gmail.com"));
        Cliente cli2 = repoCli.leerUno(1);
        System.out.println("Cliente invitado leído y modificado por normal: " + cli2.toString());*/
        
        Cliente modificado2 = new Cliente (1, "Ana3", "ana3@gmail.com");
        repoCli.modificar2(modificado2);
        System.out.println(repoCli.leerUno(1).toString());
    }
}
