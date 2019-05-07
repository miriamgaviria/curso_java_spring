
package pkg01_ejemplojava;


public class Tucan {
    
    String[] colores;
    float longitud;
    int edad;
    
    public Tucan (){
        this.edad = 0;
        longitud =5f;
        colores = new String[]{"blanco", "marron"};
    }
           
    
    public void piar (){
        System.out.println("Pío, pío");
    }
    
}
