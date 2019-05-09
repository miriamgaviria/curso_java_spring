/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class FechaSinMinutos extends GregorianCalendar {

    public FechaSinMinutos(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    //sobrecarga de métodos: dos métodos con el mismo nómbre, diferentes parámetros
    //salvo que el método sea final, que significa que no se puede modificar
    public Date getTimeWithoutMinutes(){
        Date fecha = new Date ();
        //System.out.println("Qué es la fecha en millis: " + fecha );
        fecha.setHours(0);
        fecha.setMinutes(0);
        fecha.setSeconds(0);
        //System.out.println ("Cómo queda la fecha " + fecha );
        return fecha;
    }

    @Override //sobreescribir un método
    public boolean equals(Object obj) {
        //return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        if (obj instanceof FechaSinMinutos){
            //necesario hacer un casting de tipos para acceder a los métodos de ese tipo
            FechaSinMinutos objFecha = (FechaSinMinutos)obj;
            if (this.get(YEAR) == objFecha.get (YEAR) 
                    && this.get(MONTH) == objFecha.get (MONTH)
                    && this.get(DAY_OF_MONTH) == objFecha.get (DAY_OF_MONTH)){
                return true;
                }
        } return false;
    }
    
    
}
