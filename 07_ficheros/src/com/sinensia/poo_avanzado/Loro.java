/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzado;

/**
 *
 * @author Admin
 */
public class Loro extends Mascota{

    public Loro(String nombre, float tamanho) {
        super(nombre, tamanho, 2, true, false);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " se mueve poco, porque está enjaulado");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " quiere volar");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " disfruta con el alpista");
    }

    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " pía emocionado a " + propietario.getNombre() + ".");
    }
    
}
