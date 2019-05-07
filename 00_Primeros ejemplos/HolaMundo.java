class HolaMundo {
	public static void main (String argumentos[]) {
		System.out.println("Hola Mundo");
		for (int i = 0; i < argumentos.length; i++) {
			System.out.println("Argumento" + i + " = " + argumentos [i]);
		}
		
		int entero = 12;
		long enteroLargo = 123456789012l;
		float decimal;
		decimal = 12345678901234567890123456789f;
		double doblePrecision = 12345678901234567890123456789d;
		byte unByte = -127;
		String texto = "Variable tipo String.";
		char caracter = 'a'; 
		
		System.out.println("entero = " + entero);
		System.out.println("entero largo = " + enteroLargo);
		System.out.println("decimal = " + decimal);
		System.out.println("doble = " + doblePrecision);
		System.out.println("byte = " + unByte);	
		System.out.println("String = " + texto);
		System.out.println("char = " + caracter);
		
	}
}