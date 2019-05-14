/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.pruebas;

import java.awt.BorderLayout;

/**
 *
 * @author Admin - Miriam
 */
public class TratamientoCadenas {
    public static void pruebasString(){
        String quijote = "En un lugar de la Mancha....";
        System.out.println(quijote);
        
        if(quijote.contains("Mancha")){
            System.out.println ("Contiene mancha");            
        }
        
        if (quijote.contains("manCHA")){
            System.out.println ("Contiene manCHA");   
        }else{
            System.out.println ("No contiene manCHA"); 
        }
        
        if(quijote.toLowerCase().contains("manCHA".toLowerCase())){
            System.out.println ("Contiene mancha"); 
        }else{
            System.out.println ("No contiene manCHA"); 
        }
        
        if(quijote.startsWith("En un lugar"))System.out.println ("Empieza por En un lugar"); 
        if(quijote.endsWith("Mancha...."))System.out.println ("Acaba por en Mancha....");  
        
        System.out.println ("CharArt 6: "+ quijote.charAt(6)); 
        
        System.out.println(String.format("El texto %s tiene '%d' caracteres", quijote, quijote.length()));
        
        System.out.println(String.format("%.2f; %.1f; %.3f; %.0f;", 1.1f, 2.2f, 3.3f, 4.4f));
        
        System.out.println("Mancha está en la posición "+ quijote.indexOf("Mancha"));
        
        if(!quijote.isEmpty()) System.out.println("Quijote no está vacía");//si devuelve true, lo pasa a false: si no está vacío
        
        System.out.println("La última 'a' está en " + quijote.lastIndexOf('a'));
        
        System.out.println("Trozo de cadena desde la posición 6 a la 14: " + quijote.substring(6, 14));//desde el carácter 6 al 11
        
        String palabras [] = quijote.split(" ");
        for (String palabra : palabras) System.out.println("  Palabra: " + palabra);
        
        String strCsv = "Miriam, 654987321, Calle Mayor 10";
        for (String dato : strCsv.split(",")){
            System.out.println("     Datos:    " + dato.trim());
        }
        
    }
}
