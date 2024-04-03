package prueba;


public class HilosJava {

	public static void main(String[] args) {
		
		
		Thread hilo = new Thread() {
			
			@Override
			public void run() {
				
				System.out.println(this);
				
				try {
					Thread.sleep(3000);
				} catch(InterruptedException ie) {
					////
				}
				
				System.out.println("\n\n\n\t\t >>>>> HOLA HILO JAVA");

			}
			
			
			@Override
			public String toString() {
				return super.toString() + 
						"\n ¿VIVO? " + isAlive() + 
						"\n ¿ESTADO? " + getState() ;
			}
						
		};
		
		
		
		System.out.println("EL HILO SIN ARRANCAR ... " + hilo + "\n");
		// Thread[Thread-0,5,main]
		
		
		System.out.println("\n\nEL HILO ARRANCADO");
		hilo.start();	// COMO SERÍA EL CONSUMIR UNA PROMESA promesa.then(callback())	

		
		/*		
		EL HILO SIN ARRANCAR ... Thread[Thread-0,5,main]

		HOLA		
		*/
		
	}
	
}
