package unarios;



public class Prueba {
	
	public static void main(String[] args) {
		
		//int x = 0;
		
		/*
		int x = 0;
		
		System.out.println(x++);	// 0
		System.out.println(x);		// 1
		*/
		
		
		
		/*
		byte b = -128;		// [-128 .. 127]
		
		//b = b - 1; // int
		
		System.out.println(b--);	// ESPERABA TENER -128 - 1 = -129 (OVERFLOW)
		System.out.println(b);		// PÉRDIDA DE PRECISIÓN NUMÉRICA (+127)
		*/
		
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);			
		}
			
		System.out.println("LANZAMIENTO !!!");
	}
	
}
