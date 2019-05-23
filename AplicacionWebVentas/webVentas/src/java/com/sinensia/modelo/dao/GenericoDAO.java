/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.modelo.dao;

import com.sinensia.modelo.Entidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin - Miriam
 * @param <T> El tipo hereda de Entidad
 */
public class GenericoDAO<T extends Entidad> implements InterfazDAO<T>{
    HashMap <Integer, T> mapa;
    
    public GenericoDAO(){
        mapa = new HashMap<>();
    }
    
    static int contadorIds;
    @Override
    public T insertar (T cli){
        contadorIds++;
        if (cli == null){
            System.err.println("No se pueden añadir números");
        }else{
            mapa.put(contadorIds, cli);
            cli.setId(contadorIds);
            return cli;
        }
        return null;
    }
    
    @Override
    public T obtenerUno(Integer id){
        if (mapa.containsKey(id)){
            return mapa.get(id);
        }
        System.err.println("Clave/id no encontrado " + id);
        return null;
    }
    
    @Override
    public List<T> obtenerTodos() {
        System.out.println("LEER TODOS LOS ELEMENTOS");
        ArrayList <T> listaLectura = new ArrayList<>();
        for (Map.Entry<Integer, T> parClaveValor : mapa.entrySet()){
            T cliente = parClaveValor.getValue();// las dos líneas equivalen a listaLectura.add(parClaveValor.getValue);
            cliente.getId();
            listaLectura.add(cliente);
        }
        return listaLectura;
    }
    
    @Override
    public void eliminar(T cliente) {//nombre de parámetro T corresponde con el de valor de interfaz, es sólo nombre variable de método
        mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(Integer idT) {
        mapa.remove(idT);
    }
 
    @Override
    public T modificar(T cliente){
        mapa.replace(cliente.getId(), cliente);
        return cliente;
    }
    
    /*public void modificar(T cliente) {
        T clienteModificado = mapa.get(cliente.getId());
        clienteModificado.setNombre(cliente.getNombre());
        clienteModificado.setEmail(cliente.getEmail());
        System.out.println("MODIFICADO");
        System.out.println(clienteModificado.getNombre());
        System.out.println(clienteModificado.getEmail());
    }*/
}
