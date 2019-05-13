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
public abstract class AnimalSalvaje extends Animal{
    
    protected String habitat;

    public AnimalSalvaje(String nombre, float tamaño) {
        super(nombre, tamaño);
    }
    
    public AnimalSalvaje(String nombre, float tamanho, int patas, boolean aerobico, boolean acuatico) {
        super(nombre, tamanho, patas, aerobico, acuatico);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
