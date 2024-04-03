package p2;


public class Ambito {

	private int dinero = 500;
	
	
	public void metodo1() {
		
		int x = 1;
		System.out.println("X = " + x);
		
		// System.out.println("Y = " + y); // NO SE VE / NO EXISTE.
		
		System.out.println("DINERO ... " + dinero);		
		
	}
	
	
	
	public void metodo2() {
		
		int y = 2;
		
		//System.out.println("X = " + x); // ERROR ... ES DEL MÉTODO 1, NO SE VE AQUÍ
		System.out.println("Y = " + y);
		
		System.out.println("DINERO ... " + dinero);
		
	}


		
		
		
	//////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		//System.out.println("DINERO ... " + dinero);
		
		System.out.println("DINERO ... " + new Ambito().dinero);
		
	}
	
	//////////////////////////////////////////////////////////////////////	
	
}