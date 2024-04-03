package p0;


public class Gato {

	private String nombre;
	private byte edad;			// 0 byte

	public Gato(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void incrementar1año() {
		edad++;
		//edad += 1;
	}
	
	
	public void incrementarEdad(byte cuantosAños) {		
		//edad += cuantosAños;
	
		//edad = (byte)edad + (byte)cuantosAños;	// autopromoción a int + int ... resultado int
		
		edad = (byte) (edad + cuantosAños);	// autopromoción a int + int ... resultado int
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "GATO: " + nombre + ", edad = " + edad;
	}
	
	
	////////////////////////////////////////////////
	
	public static void main(String[] args) {
	
		Gato gato = new Gato("ISIDORO");
		
		System.out.println(gato);
		
		gato.incrementar1año();
		
		System.out.println(gato);
		
	}	
	
	
}
