package p0;


public class Variables {

	final static String MENSAJE = "INVIERTE EN BOLSA"; // EAGERLY

	
	public static void main(String[] args) {
	
		System.out.println(MENSAJE);
		
		
		int dinero = 5;

		
		System.out.println("TENGO " + dinero + " EUROS");
		
		
		final int precioVenta = 1500; // const en JavaScript.
		
		// RENEGOCIAR PRECIO VENTA:
		// precioVenta = 1400;
		
		if(true) {			
			boolean bajarTipos = true;
			dinero = dinero + 10;
		}
		
		//System.out.println("¿VAN A BAJAR LOS TIPOS DE INTERES? ... " + bajarTipos);
		
		System.out.println("¿CUANTO DINERO TIENES SI TE DOY OTROS 10? ... " + dinero);
	}
	
}
