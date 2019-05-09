
package com.sinensia;


public class ClienteInvitado extends Cliente {
    
    public ClienteInvitado(long idCliente, String nombreCliente, String email) {
        super(idCliente, nombreCliente, email);
        
    }
    private int duracionMax;

    /**
     * Get the value of duracionMax
     *
     * @return the value of duracionMax
     */
    public int getDuracionMax() {
        return duracionMax;
    }

    /**
     * Set the value of duracionMax
     *
     * @param duracionMax new value of duracionMax
     */
    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }

    
    
}
