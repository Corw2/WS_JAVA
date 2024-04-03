package p9;


public class Pantalon {

	private static int contador;		// 0
	
	
	public Pantalon() {
		System.out.println("SE HA CREADO EL PANTALON ... " + hashCode());
		contador++;
	}
	
	
	public static void main(String[] args) {
		
		/*
		new Pantalon();
		new Pantalon();
		*/
		
		for (int i = 1; i <= 10; i++) {
			new Pantalon();			
		}
		
		System.out.println("\n\nCONTADOR PANTALONES ... " + contador);
		
		
	}
	
}
