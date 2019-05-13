/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

/**
 *
 * @author Admin
 */
public class Dragon extends Mascota implements Depredador{

    public Dragon(String nombre, float tamanho) {
        super(nombre, tamanho, 2, true, false);
    }
  
    @Override
    public void mover() {
        System.out.println(nombre + " se mueve con agilidad para destruir el muro");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela y quema que da gusto");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come.... corre que te pilla!!");
    }

    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " le da los bueños días a " + propietario.getNombre() + " calentando la casa");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " quema, vuela y caza " + presa);
    }
    
}
