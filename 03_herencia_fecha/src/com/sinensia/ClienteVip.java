/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteVip extends Cliente {
    
    public ClienteVip(long idCliente, String nombreCliente, String email) {
        super(idCliente, nombreCliente, email);
        
    }
    
    private String beneficio;

    /**
     * Get the value of Beneficio
     *
     * @return the value of Beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }

    /**
     * Set the value of Beneficio
     *
     * @param Beneficio new value of Beneficio
     */
    public void setBeneficio(String Beneficio) {
        this.beneficio = beneficio;
    }

}
