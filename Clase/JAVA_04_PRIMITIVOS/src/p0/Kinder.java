package p0;


public class Kinder {

	// ATRIBUTOS
	private boolean conRegalo;		// BLANKED VARIABLES.
	private int peso;
	private double precio;
	
		
	// CONSTRUCTORES
	public Kinder() {
		conRegalo = true;
		peso = 40;
		precio = 1.80;
	}	
	
	
	// MÉTODOS

	public String toString() {
		return "HUEVO KINDER: \n" +
				"REGALO: Coche en miniatura. \n" +
				"PESO: " + peso + " gr. \n" +
				"PRECIO: " + precio + " €";
	}	
	
	
	
	///////////////////////////////
	
	public static void main(String[] args) {
		
		System.out.println( new Kinder() );
		
	}
	
}
