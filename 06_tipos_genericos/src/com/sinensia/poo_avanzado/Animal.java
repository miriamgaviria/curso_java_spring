
package com.sinensia.poo_avanzado;

public abstract class Animal {
    protected String nombre;
    protected float tamanho;
    protected int patas;
    protected boolean aerobico;
    protected boolean acuatico;

    public Animal(String nombre, float tamaño) {
        this.nombre = nombre;
        this.tamanho = tamaño;
        this.aerobico = false;
        this.acuatico = false;
        this.patas = 0;
    }

    public Animal(String nombre, float tamanho, int patas, boolean aerobico, boolean acuatico) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.patas = patas;
        this.aerobico = aerobico;
        this.acuatico = acuatico;
    }
    
    public abstract void mover();
    
    public abstract void volar();
    
    public abstract void comer();
        
    public boolean isAnfibio(){
        return aerobico && acuatico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamanho;
    }

    public void setTamaño(float tamaño) {
        this.tamanho = tamaño;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isAerobico() {
        return aerobico;
    }

    public void setAerobico(boolean aerobico) {
        this.aerobico = aerobico;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }
    
}
