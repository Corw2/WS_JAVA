package p4;


public class CocheDeportivo {

	private final String marca;
	private final int precio;
	private final int matricula;
		

	public CocheDeportivo(String marca, int precio) {		
		//super();
		
		this.marca = marca;
		this.precio = precio;
		
		matricula = hashCode();
	}
	
	
	public String toString() {
		return 	"TIPO = " + getClass().getSimpleName() + "\n" +
				"MARCA = " + marca + "\n" + 
				"PRECIO = " + precio + "\n" +
				"MATRICULA = " + matricula;
	}
	
	
	/////////////////////////////////////////
	
	public static void main(String[] args) {
		
		/*
		Coche coche1 = new Coche();
		
		System.out.println(coche1);
		*/
		
		
		CocheDeportivo[] losCoches = { 
										new CocheDeportivo("Ferrari", 250000),
										
										new CocheDeportivo("Lamborgini", 160000)										
									 };
		
		
		for (CocheDeportivo coche : losCoches) {
			System.out.println(coche + "\n");
		}
		
	}
	
}
