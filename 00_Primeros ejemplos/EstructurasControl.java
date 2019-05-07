class EstructurasControl {
	public static void main (String argumentos[]) {
		int contador = 0; 
		while (contador < 5) {
			System.out.println("Línea while " + contador);
			contador ++;
		}
		
		for (int i = 0; i < 5; i++){
			System.out.println("Línea bucle for " + contador);
		}
	}
}