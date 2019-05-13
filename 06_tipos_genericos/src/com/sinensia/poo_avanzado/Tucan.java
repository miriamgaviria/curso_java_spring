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
public class Tucan extends AnimalSalvaje{
    public Tucan(String nombre, float tamanho){
        super (nombre, tamanho, 2, true, false);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " volando va");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " aletea todo el día");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " debora el alpiste");
    }
}
