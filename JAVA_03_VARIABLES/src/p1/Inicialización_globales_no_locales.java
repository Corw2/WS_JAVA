package p1;

public class Inicialización_globales_no_locales {

	
	
	
	//CAMPOS GLOBALES DE LA CLASE Y NO ESTATICOS== ATRIBTOOS DE LOS FTUROS OBJETOS.
	
	//PRIMITIVOS
	boolean ricoPobre; 
	
	ricoPobre = "INICIAIZAN EN FALSE";

	int dinero; //SE INICIAIZAN EN 0

	double precision; //SE INICIAIZAN EN 0.0
	
	long longitud; //SE INICIAIZAN EN 
	
	char caracter; //SE INICIAIZAN EN `\u0000`
	
	
	//REFERENCIADOS
	String nombre; //SE INICIAIZAN EN null
	

	public static void main(String[] args) {
		
		//PRIMITIVOS: 	BOOLEANOS: boolean
		//				NUMERICOS: byte - short - char - int - long --- float - double
	
	/*
	 
	 //CONSTRUCTOR IMPLICITO.
	public Inicialización_globales_no_locales();
		super();
	*/
		
		System.out.println("ricoPobre");
		System.out.println("dinero");
		System.out.println("precision");
		System.out.println("caracter");
		System.out.println("longitud");
		
		System.out.println("nombre");

		
	}

}
