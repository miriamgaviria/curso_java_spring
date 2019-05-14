
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Admin - Miriam
 */
public class ClienteDAO implements InterfazDAO<Cliente>{
    HashMap <Long, Cliente> mapa;
    
    public ClienteDAO(){
        mapa = new HashMap<>();
    }
    
    @Override
    public void poner (Cliente cli){
        if (cli == null){
            System.err.println("No se pueden añadir números");
        }else{
            mapa.put(cli.getId(), cli);
        }
    }
    
    @Override
    public Cliente leerUno(long idCliente){
        if (mapa.containsKey(idCliente)){
            return mapa.get(idCliente);
        }
        System.err.println("Clave/id no encontrado " + idCliente);
        return null;
    }
    
    @Override
    public List<Cliente> leerTodos() {
        System.out.println("LEER TODOS LOS ELEMENTOS");
        ArrayList <Cliente> listaLectura = new ArrayList<>();
        for (Map.Entry<Long, Cliente> parClaveValor : mapa.entrySet()){
            Cliente cliente = parClaveValor.getValue();// las dos líneas equivalen a listaLectura.add(parClaveValor.getValue);
            cliente.getId();
            listaLectura.add(cliente);
        }
        return listaLectura;
    }
    
    @Override
    public void eliminar(Cliente cliente) {//nombre de parámetro Cliente corresponde con el de valor de interfaz, es sólo nombre variable de método
        mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long idCliente) {
        mapa.remove(idCliente);
    }

    /*
    public void modificar(Cliente cliente) {
        Cliente clienteModificado = mapa.get(cliente.getId());
        clienteModificado.setNombre(cliente.getNombre());
        clienteModificado.setEmail(cliente.getEmail());
        System.out.println("MODIFICADO");
        System.out.println(clienteModificado.getNombre());
        System.out.println(clienteModificado.getEmail());
    }*/
    
    public void modificar2(Cliente cliente){
        mapa.replace(cliente.getId(), cliente);
    }
}
