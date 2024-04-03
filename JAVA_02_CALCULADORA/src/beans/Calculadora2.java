package beans;


public class Calculadora2 {

	final static int RANGO = 100;
	
	
	private static int generarNumeroAleatorio() {
		return (int)(Math.random() * RANGO + 1); 	// [1..100]		
	}
	
	
	private static int sumar(int x, int y) {
		return x+y;
	}
	
	private static void imprimirNumeros(int[] numeros) {
		////////////////
	}
	
	
	public static int sumarAleatorios(int cuantos) {
		
		final int[] numeros = new int[cuantos];			// new Array() JAVASCRIPT.
		
		int sumaTotal = 0;

		
		
		for (int i=0; i < cuantos; i++) {
			
			int aleatorio = generarNumeroAleatorio();
			
			numeros[i] = aleatorio;
			
			sumaTotal = sumar(sumaTotal, aleatorio);
			
		}		
		
		
		
		// IMPRIMIR EL ARRAY DE NUMEROS
		imprimirNumeros(numeros);
		
		
		return sumaTotal;
	}
	
}
