/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin - Miriam
 */
public class ProbandoGenericos {
    public static void probarMetodo(){
        int num = 10;//tipo primitivo
        Integer objNum = new Integer (10);//Integer es un objeto (referencia instanciado en memoria) con sus métodos
        num = 11;
        String texto = "" + String.valueOf(num);
        String texto2 = "" + objNum.toString();
        
        ArrayList<Integer> listaInt = new ArrayList <>();
        insertarDoble(listaInt, 10);
        insertarDoble(listaInt, 15);
        System.out.println ("Entero: " + listaInt.toString());
        
        ArrayList<String> listaStr = new ArrayList <>();
        insertarDoble(listaStr, "Texto1");
        insertarDoble(listaStr, "Texto2");
        System.out.println ("Cadena: " + listaStr.toString());
        
        ArrayList<Date> listaDate = new ArrayList <>();
        insertarDobleGenerico(listaDate, new Date (82, 4, 10));
        insertarDobleGenerico(listaDate, new Date (85, 3, 25));
        System.out.println ("Fecha: " + listaDate.toString());
        
        insertarDobleGenerico(listaStr, "Texto3");
        insertarDobleGenerico(listaStr, "Texto4");
        System.out.println ("Cadena: " + listaStr.toString());
    }
    
    public static void insertarDoble(ArrayList<Integer> lista, int valor){
        lista.add(valor);
        lista.add(valor);        
    }
    
    public static void insertarDoble(ArrayList<String> lista, String valor){
        lista.add(valor);
        lista.add(valor);        
    }
    
    public static<Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){
        lista.add(valor);
    }
}
