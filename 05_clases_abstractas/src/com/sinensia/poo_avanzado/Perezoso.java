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
public class Perezoso extends AnimalSalvaje implements Depredador, Mamifero{
    
    public Perezoso(String nombre, float tamaño) {
        super(nombre, tamaño, 2, false, false);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " no cree necesario tener que moverse");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " Volar?? Uy, eso es mucho para él");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " sólo come si la comida está hecha");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " caza a " + presa + " despistándola.");
    }

    @Override
    public void mamar() {
        System.out.println(nombre + " mama tres veces al día.");
    }

    @Override 
    public String mamar2(TortugaNinja madre) {
        String mensaje = nombre + " mama de su madre " + madre.getNombre();
        System.out.println (mensaje);
        return mensaje;
    }

    @Override
    public String mamar3(Mamifero madre) {
        Animal anim = (Animal) madre;
        if (anim instanceof Animal){
            String mensaje = nombre + " mama de su madre " + ((Animal)madre).getNombre();
            System.out.println (mensaje);
            return mensaje; //To change body of generated methods, choose Tools | Templates.
        }else{
            return null;
        }
    }
 
    /*
    @Override
    public String mamar3(Mamifero madre) {
          
        String mensaje = nombre + " mama de su madre " + madre.toString();
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public String toString() {
        return nombre;
    } */ 
}
