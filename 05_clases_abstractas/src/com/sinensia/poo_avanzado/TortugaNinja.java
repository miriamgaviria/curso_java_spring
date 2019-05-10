
package com.sinensia.poo_avanzado;

public class TortugaNinja extends Mascota implements Mamifero{

    public TortugaNinja(String nombre, float tamanho) {
        super(nombre, tamanho, 4, true, true);
    }
    
    @Override
    public void mover() {
        System.out.println(nombre + " Salto mortal de edificio");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " Come más de lo que crees");
    }
    
    @Override
    public void saludarPropietario() {
        System.out.println(nombre + " 'Corre' para saludar a su dueño");
    }
    
    @Override
    public void volar() {
        /*try {
            System.out.println(nombre + " Tiene vértigo a las alturas");
        }catch (UnsupportedOperationException e){
            System.out.println(" Error" + e);
        }*/
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mamar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mamar2(TortugaNinja madre) {
        return null;
    }
    
    /*Animal anim = (Animal) madre;
        if (anim instanceof Animal){
            String mensaje = nombre + " mama de su madre " + ((Animal)madre).getNombre();
            System.out.println (mensaje);
            return mensaje; //To change body of generated methods, choose Tools | Templates.
        }else{
            return null;
        }*/

    public String mamar3(Mamifero madre){
        Animal anim = (Animal) madre;
        if (anim instanceof Animal){
            String mensaje = nombre + " mama de su madre " + ((Animal)madre).getNombre();
            System.out.println (mensaje);
            return mensaje; //To change body of generated methods, choose Tools | Templates.
        }else{
            return null;
        }
        
        /*@Override
        public String mamar3(Mamifero madre) {
            String mensaje = nombre + " mama de su madre " + madre.toString();
            System.out.println(mensaje);
            return mensaje;
        }       
    }  
        @Override
        public String toString() {
            return nombre; //To change body of generated methods, choose Tools | Templates.
        }*/ 
    }
    
     
}
