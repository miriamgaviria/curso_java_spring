/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin - Miriam
 */
public class Ficheros {
    public static void probarEscritura() throws IOException{
        String[] lineasTexto = {
            "Línea primera",
            "Segunda línea",
            "Tercera y última línea"};
        
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("fichero_texto.txt");//("fichero_texto.txt, true");true = añade; false = sobreescribe
            for (String linea : lineasTexto){
                fichero.write(linea + "\r\n");
            }
            //fichero.close(); Como se ejecuta siempre en el finally, esta no es necesaria
        }catch (IOException e){
            System.out.println ("Mensaje de error: " + e.getMessage());
        }finally{
            fichero.close();//lanzo la excepción que capturo en main
            System.out.println("Fichero cerrado");
            /*Capturo la IOExxception al poner .close()
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }
    
    /*flujo de datos: escribe (write(parámetro: lo que queremos escribir)) lo guardado en buffered (bufferedWriter(objeto codificado)) 
    a través de la codificación determinada (outputStreamWriter(fichero, codificación)) que llega a un archivo que hemos 
    abierto (FileOutPutStream(nombre del fichero)). 
    */
    public static void escrituraStream(){
        String[] lineasTexto = {
            "Línea primera",
            "Segunda línea",
            "Tercera y última línea"};
        
        Writer out = null;
        try{
            //stream = flujo de datos, de bytes
            FileOutputStream streamFich = new FileOutputStream("fichero_2.txt");//objeto de salida del flujo al fichero
            OutputStreamWriter streamWriter = new OutputStreamWriter(streamFich, "UTF-8");// capa intermedia para crear el flujo con codificación especificada
            out = new BufferedWriter (streamWriter);//buffered (memoria cache) que recibe datos y cuandos se rellena, los envía al strem de salida
            //Se escribe sobre BufferedWriter, cuando está lleno, pasa, con la codificación, pasan al fileoutputStream, que es el fichero
            //out = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(fich_2.txt),UTF-8));
           
            for (String linea : lineasTexto){
                try{
                    out.write(linea + "\r\n");
                }catch (IOException e2){
                    System.out.println("Error al escribir fichero: " + e2.getMessage());
                }
            }
        }catch(UnsupportedEncodingException | FileNotFoundException e2){
            System.out.println("Error 2: " + e2.getMessage());
        }finally{
            try{
                out.close();
                System.out.println("Fichero cerrardo");
            } catch (IOException e3){
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
    
    public static void lecturaFich(){
        File fichFormWin = new File ("C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\curso_java_spring\\07_ficheros\\fichero_texto.txt");
        File fichFormJava = new File ("C:/Users/Admin/Desktop/CURSO_JAVA/curso_java_spring/07_ficheros/fichero_texto.txt");
        File fichFormRelativa = new File ("fichero_texto.txt");
        Scanner escaner = null;
        try {
            System.out.println("Leyendo fich");
            escaner = new Scanner (fichFormRelativa);
            while(escaner.hasNextLine()){//busca en el escaner hasta la siguiente línea
                String linea = escaner.nextLine();//guardamos esa línea en línea
                System.out.println("<<<<<<<<\"" + linea + "\"");
                if ("Segunda línea".compareTo(linea)<0){
                    System.out.println("     es menor");
                }else if("Segunda linea".compareTo(linea)>0){
                    System.out.println("     es mayor");
                }else System.out.println("     es igual");                    
            }
        } catch (Exception e) {
            System.err.println("Mensaje: " + e.getMessage());
        }finally{
            try {
                if(escaner !=null){
                    escaner.close();
                }
            } catch (Exception e) {
                System.err.println("Mensaje al cerrar: " + e.getMessage());
            }
        }
    }
}
