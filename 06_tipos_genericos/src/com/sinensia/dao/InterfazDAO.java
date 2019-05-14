/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 * Interfax Data Access Object para toda la app
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */
public interface InterfazDAO<T>{
    void poner (T valor);
    T leerUno(long idCliente);
    List<T> leerTodos();
    void eliminar (T valor);
    void eliminar (long idCliente);
    //void modificar (T nuevoValor);
}
