/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.FechaSinMinutos;
import com.sinensia.FechaSinMinutos;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Fechas {
    public static void probar(){
        /*GregorianCalendar fecha = new GregorianCalendar ();
        System.out.println ("Sacar la fecha actual" );
        System.out.println ("Fecha: " + fecha.getTime().toString()); //convertir la fecha en un String
        
        System.out.println ("Establecer y sacar la fecha actual" );
        fecha.set(2019, 4, 8);
        System.out.println ("Fecha: " + fecha.getTime().toString()); //convertir la fecha en un String
        
        System.out.println ("Establecer y sacar la fecha actual a través de la comunicación de objetos" );
        Date fechaDate = fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());//convertir la fecha en un String
        System.out.println("Fecha: " + fechaDate);
        
        System.out.println ("Nueva fecha; mi cumpleaños" );
        FechaSinMinutos miCumple;
        miCumple= new FechaSinMinutos (2019, 11, 16);
        if (miCumple.after(fecha)){
            System.out.println("Aún no has cumplido los años");
        }else if (miCumple.before(fecha)){
            System.out.println("Ya ha sido tu cumpleaños");
        }else if (miCumple.equals(fecha)){
            System.out.println("Felicidades");
        }*/
        
        System.out.println ("Nueva fecha corregida; mi cumpleaños" );
        //FechaSinMinutos miCumple;
        //FechaSinMinutos fecha = new FechaSinMinutos (2019, 4, 8);
        Date fechaActual = new Date();
        System.out.println ("Fecha actual " + fechaActual );
        fechaActual.setHours(0);
        fechaActual.setMinutes(0);
        fechaActual.setSeconds(0);
        
        System.out.println ("Fecha actual sin números " + fechaActual );
        FechaSinMinutos miCumple = new FechaSinMinutos (2019, 4, 8);
        //miCumple.set();
        //System.out.println ("Mi cumple " + miCumple.getTime().getTime() );
        System.out.println ("Fecha mi cumple sin segundos " + miCumple.getTimeWithoutMinutes() );
        if (miCumple.equals(fechaActual)){
            System.out.println("Felicidades");
        }else if (miCumple.after(fechaActual)){
            System.out.println("Aún no has cumplido");
        }else if (miCumple.before(fechaActual)){
            System.out.println("Ya has cumplido los años");
        }
    }
}
    
