/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.dao;

import java.util.List;

/**
 * Interfax Data Access Object para toda la app
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */

// interfaz con las cuatro operaciones crud
public interface InterfazDAO<T>{
    T insertar (T valor);
    T obtenerUno(Integer idCliente);
    List<T> obtenerTodos();
    void eliminar (T valor);
    void eliminar (Integer idCliente);
    T modificar (T nuevoValor);
}
