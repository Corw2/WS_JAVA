package p1;


public class Inicializacion {

	// CAMPOS GLOBALES DE LA CLASE Y NO ESTÁTICOS == ATRIBUTOS DE LOS FUTUROS OBJETOS.
	
	// PRIMITIVOS MÁS IMPORTANTES:
	boolean ricoPobre;
	
	int dinero;
	
	double precision;

	
	// UN REFERENCIADO:
	String nombre;
	
	
	/*
	// CONSTRUCTOR IMPLÍCITO.
	 
	public Inicializacion() {
		super();
	}
	*/
	
	
	
	public static void main(String[] args) {
		
		Inicializacion ini = new Inicializacion();
		
		System.out.println(ini.ricoPobre);
		System.out.println(ini.dinero);
		System.out.println(ini.precision);
		System.out.println(ini.nombre);
		
		// LAS VARIABLES LOCALES NO SE INICIALIZAN POR SI SOLAS:
		int temperatura = 12;
		System.out.println("TEMPERATURA = " + temperatura);
		
	}
	
}




// PRIMITIVOS:	BOOLEANO:	boolean
//				NÚMERICOS:	byte - short - char - int - long --- float - double
