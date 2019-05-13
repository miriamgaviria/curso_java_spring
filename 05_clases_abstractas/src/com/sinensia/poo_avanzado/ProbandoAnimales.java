
package com.sinensia.poo_avanzado;

import com.sinensia.Cliente;

public class ProbandoAnimales {
    public static void probarAbstractas(){
        Cliente angel = new Cliente (3, "Ángel", null);
        
        Tucan unTucan = new Tucan ("Turigualpa", 18.8f);
        unTucan.mover();
        unTucan.comer();
        unTucan.volar();
        System.out.println("");
        
        Perezoso sid = new Perezoso("Sid", 30.5f);
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo", 175.5f);
        
        michelangelo.mover();
        michelangelo.comer();
        try{//probamos el código
            michelangelo.volar();
        }catch (UnsupportedOperationException e){//recoge la excepción específica
            System.err.println(e.getMessage());
        }catch(Exception e){//por si acaso, recoge una excepción general
            System.err.println(e.getMessage());
        }finally{//opciónal, este código siempre lo ejecuta
            System.err.println("Siempre se ejecuta esta línea");
        }
        
        michelangelo.setPropietario(angel);
        michelangelo.saludarPropietario();
        michelangelo.pedirComida();
        michelangelo.mamar3(sid);
        System.out.println("");  
                
        sid.comer();
        sid.volar();
        sid.mover();
        sid.cazar("una oruga");
        sid.mamar();
        sid.mamar2(michelangelo);
        sid.mamar3(michelangelo);
        System.out.println("");
        
        Loro alex = new Loro("Alex", 15.1f);
        alex.comer();
        alex.mover();
        alex.volar();
        alex.setPropietario(angel);
        alex.saludarPropietario();
        alex.pedirComida();
        System.out.println("");
        
        Animal miMascota = new Dragon ("Drogo", 4595);//conversion implícita: es de tipo dragon que viene mascota, con forma animal
        ((Mascota) miMascota).setPropietario(angel);// conversión explícita miMascota, tipo dragon y forma animal,recupera la forma de mascota
        ((Mascota) miMascota).volar();
        ((Mascota) miMascota).comer();
        ((Mascota) miMascota).mover();
        ((Mascota) miMascota).pedirComida();
        ((Mascota) miMascota).saludarPropietario(); 
        ((Dragon) miMascota).cazar("animalillos desvalidos.");
        // se podría hacer Mascota miMascota = new Dragon ("Drogo", 4595); miMascota.volar().
    }
    
}
