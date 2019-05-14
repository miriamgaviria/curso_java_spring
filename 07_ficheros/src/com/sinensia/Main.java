
package com.sinensia;

import com.sinensia.dao.ProbandoDAO;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzado.ProbandoAnimales;
import com.sinensia.pruebas.Colecciones;
import com.sinensia.pruebas.Ficheros;
//import static com.sinensia.pruebas.Ficheros.probarEscritura;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Mostrar;
import static com.sinensia.pruebas.Mostrar.mostrando;
import com.sinensia.pruebas.TratamientoCadenas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
            //Colecciones.ejemploHashMap();
            //Colecciones.ejemploListas();
            //Colecciones.ejemploSet();
            //Colecciones.comparaciones
            
            //Fechas.probar();
            
            //probandoHerencia();
            
            //Mostrar.mostrando();
            
            //ProbandoAnimales.probarAbstractas();
            //ProbandoGenericos.probarMetodo();
            //ProbandoDAO.probarCliente();
            
            /*try {
                Ficheros.probarEscritura();
                } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            Ficheros.escrituraStream();
            Ficheros.lecturaFich();*/
            
            TratamientoCadenas.pruebasString();
    } 
}
