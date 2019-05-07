
package pkg01_ejemplojava;


public class Main {

    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true; 
        if (3 > 5) {
            if (condicion || false){
                System.out.println("Es verdadero");
            }
        } else if (5 > 7) {
            System.out.println("No se ejecuta");
        } else {
            System.out.println("Cualquier otro caso");
        } 
        
        char letra = 'a';
        switch (letra){
            case 'A':
                System.out.println("Aaaaaa");
                break;
            case 'B':
                System.out.println("Bbbbbb");
                break;
            case 'C':
                System.out.println("Ccccc");
                break;
            default : System.out.println("Letra desconocida");
        }
        String formateado = nombreApell  ("Miriam", "Gaviria Aguerri");
        System.out.println(formateado);
        
        Tucan miPajaro; // declaro un objeto, referencia a un objeto = dirección de memoria
        miPajaro = new Tucan(); // asignamos un valor a la variable
        // igual a Tucan miPajaro = new Tucan ();
        miPajaro.longitud = 20.5f;
        System.out.println("Longitud de miTucan: " + miPajaro.longitud);
        
        Tucan otroPajaro = new Tucan ();
        otroPajaro.longitud = 12.5f;
        System.out.println("Longitud del otroTucan: " + otroPajaro.longitud);
        
        System.out.println(miPajaro);
        System.out.println(otroPajaro);
        
        otroPajaro = miPajaro; // convierto a los dos objetos dependientes
        System.out.println(otroPajaro);
        
        miPajaro.longitud = 67.5f;
        System.out.println("La longitud de miPajaro es " + miPajaro.longitud);
        System.out.println("La longitud de otroPajaro es " + otroPajaro.longitud);
        
        otroPajaro.edad = 2;
        System.out.println("La edad de miPajaro es " + miPajaro.edad);
        System.out.println("La edad de otroPajaro es " + otroPajaro.edad);
        
        System.out.print("miPajaro canta así:  "); miPajaro.piar();
        System.out.print("otoPajaro canta así:  ");otroPajaro.piar();
        
        Tucan nuevoTuc = new Tucan ();
        System.out.println("Longitud de nuevoTuc " + nuevoTuc.longitud);
    }
    
    static String nombreApell(String nombre, String apellidos){
           return apellidos + ", " + nombre; 
    } 
}
