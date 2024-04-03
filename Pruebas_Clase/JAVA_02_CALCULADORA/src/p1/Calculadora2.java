package p1;

public class Calculadora2 {
	
	final static int RANGO =100;
	
	public static int generarNumeroAleatorio() {
		
		return (int) (Math.random() * RANGO +1);
	}

}
