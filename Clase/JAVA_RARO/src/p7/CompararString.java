package p7;


public class CompararString {

	public static void main(String[] args) {
		
		String c1 = "PEPE";		// SE CREA Y SE GUARDA EN EL POOL DE STRING PARA FUTURA REUTILIZACIÓN
		
		String c2 = new String("PEPE");		// "PEPE";
		
		
		//System.out.println(c1.equals(c2));
		
		//System.out.println(c1.equalsIgnoreCase(c2));
		
		//System.out.println(c1 == c2);
		
		//System.out.println(c1 == "PEPE");		
		
		
		/*

		String xxx = "abc";					// abc
		
		String yyy = xxx.toUpperCase();		// ABC
				
		System.out.println("xxx == yyy ....... " + (xxx == yyy));
		
		System.out.println(xxx = yyy);		// ABC
		
		System.out.println(xxx);			// ABC
		
		*/
		
		/*
		String cadena1 = "HOLA";
		
		String cadena2 = "MUNDO";
		
		String cadena3 = cadena1 + cadena2;
		*/
		
		
		// LOS STRING COMO LOS WRAPPERS SON OBJETOS INMUTABLES (no pueden cambiar su contenido).
		
	}
	
}
