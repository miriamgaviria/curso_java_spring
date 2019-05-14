/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin - Miriam
 */
public class LecturaFichero {

    public static void leerFichero() {
        File fichero = new File("ejercicio_ficheros.txt");

        Scanner escaner = null;
        try {
            //Leo el fichero
            escaner = new Scanner(fichero);
            //mientras tenga líneas el fichero
            while (escaner.hasNextLine()) {
                // guardo en linea cada línea del fichero
                String linea = escaner.nextLine();
                // divido la línea en las diferentes palabras
                String palabras[] = linea.split(",");
                // guardo en variable el número de palabras de cada línea para luego hacer el if
                int palabrasLinea = palabras.length;

                HashMap<String, Cliente> clientesFichero = new HashMap<String, Cliente>();

                if (palabrasLinea == 4 || palabrasLinea == 5) {
                    int id = Integer.valueOf(palabras[0]);//Integer.parseInt...
                    String nombre = palabras[1];
                    String mail = palabras[2];
                    boolean activo = Boolean.valueOf(palabras[3]);// = palabras[3}.equals(true)? true : false
                    if (palabrasLinea == 4) {
                        Cliente nuevoCliente = new Cliente(id, nombre, mail, activo);
                        clientesFichero.put(palabras[0], nuevoCliente);
                    } else if (palabrasLinea == 5) {
                        int duracionMaxima = Integer.valueOf(palabras[4]);
                        ClienteInvitado nuevoClienteInvitado = new ClienteInvitado(id, nombre, mail, activo, duracionMaxima);
                        clientesFichero.put(palabras[0], nuevoClienteInvitado);
                    }
                }

                for (Map.Entry<String, Cliente> parClaveValor : clientesFichero.entrySet()) {
                    System.out.println("Clave: " + parClaveValor.getKey());
                    Cliente cliente = parClaveValor.getValue();
                    System.out.println(cliente.toString());
                }
            }
        } catch (Exception e) {
            System.err.println("Mensaje: " + e.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception e) {
                System.err.println("Mensaje al cerrar: " + e.getMessage());
            }
        }
    }
}
