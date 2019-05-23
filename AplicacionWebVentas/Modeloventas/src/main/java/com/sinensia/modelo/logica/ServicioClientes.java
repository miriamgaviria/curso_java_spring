/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.modelo.logica;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.dao.MySQLClienteDAO;
// implementación de la lógica del servicio
/**
 *
 * @author Admin - Miriam
 */
public class ServicioClientes {
    private MySQLClienteDAO dao;
    
    public ServicioClientes(){
        dao = new MySQLClienteDAO();
    }
    
    public Cliente insertar (String nombre, String email, String passwd, String edad, String activo){
        if (nombre == null || nombre ==""){
            return null;
        }
        
        if(validar(nombre, email, passwd, edad, activo)){
            short iEdad = Short.parseShort(edad);
            short iActivo = (short) ("on".equals(activo) ? 1 : 0);
            Cliente nuevoCli = new Cliente (null, nombre, email, iEdad, passwd, iActivo);
            dao.insertar(nuevoCli);
            return nuevoCli;
        }else{
           return null;
        }
    }
    
    public Cliente obtenerUno(int id){
        return dao.obtenerUno(id);
    }
    
    public Cliente obtenerUno(String email){
        return dao.obtenerUno(email);
        /*for (Cliente c : dao.obtenerTodos()){
            if (c.getEmail().equals(email))
                return c;
        } 
        return null;*/
    }
    
    public void eliminar(int id){
        dao.eliminar(id);
    }
    
    public void eliminar(String email){
        eliminar(obtenerUno(email).getId());
    }
    
    public Cliente modificar(int id, String nombre, String email, String passwd, String edad, String activo){
        Cliente cli = null;
        if (validar(nombre, email, passwd, edad, activo)) {
            cli = new Cliente (id, nombre, email, Short.parseShort(edad), passwd, (short)("on".equals(activo) ? 1: 0 ));
            cli = dao.modificar(cli);
        }
        return cli;
    }
    
    public boolean validar (String nombre, String email, String passwd, String edad, String activo){
        if (nombre == null || nombre ==""){
            return false;
        }
        
        if (email == null || email ==""){
            return false;
        }
        
        if (passwd == null || passwd ==""){
            return false;
        }
        
        short iEdad = 0; 
        try {
            iEdad = Short.parseShort(edad);
        } catch (Exception e) {
            return false;
        }
        
        if (iEdad <= 0){
            return false;
        }
        
        // activo puede ser null, por eso se compara primero "on"
        short iActivo = (short) ("on".equals(activo) ? 1 : 0);
        
        return true;
    }
}
