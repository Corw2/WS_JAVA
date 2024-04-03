package p3;


public class Coche {

	private final String MARCA = "FERRARI";
	private final int PRECIO = 250000;
		

	public Coche() {
		super();
	}
	
	
	public String toString() {
		return 	"TIPO = " + getClass().getSimpleName() + "\n" +
				"MARCA = " + MARCA + "\n" + 
				"PRECIO = " + PRECIO;
	}
	
	
	/////////////////////////////////////////
	
	public static void main(String[] args) {
		
		/*
		Coche coche1 = new Coche();
		
		System.out.println(coche1);
		*/
		
		
		Coche[] losCoches = { new Coche(), new Coche(), new Coche() };
		
		
		for (Coche coche : losCoches) {
			System.out.println(coche + "\n");
		}
		
	}
	
}
