
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public abstract class Mascota extends Animal {
    
    protected Cliente propietario; //propiedad del objeto cliente, porque todas las mascotas tienen dueño
    
    public Mascota(String nombre, float tamanho, int patas, boolean aerobico, boolean acuatico) {
        super(nombre, tamanho, patas, aerobico, acuatico);
    }
    
    public void pedirComida(){
        System.out.println(propietario.getNombre() + " ALIMÉNTAME!!!");
    }
    
    public abstract void saludarPropietario();

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
}
