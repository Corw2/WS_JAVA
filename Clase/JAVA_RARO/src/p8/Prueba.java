package p8;


public class Prueba {

	public static void main(String[] args) {
		
		
		//Bombilla bombilla = new Bombilla();
		
		
		/*
		BombillaAzul bombillaAzul = new BombillaAzul();		
		System.out.println("¿LUZ? ... " + bombillaAzul.iluminar());
		
		BombillaRoja bombillaRoja = new BombillaRoja();		
		System.out.println("¿LUZ? ... " + bombillaRoja.iluminar());

		BombillaVerde bombillaVerde = new BombillaVerde();		
		System.out.println("¿LUZ? ... " + bombillaVerde.iluminar());
		*/
		
		
		/*
		// Bombilla es el supertipo o clase madre de BombillaAzul.
		
		Bombilla bombilla = new BombillaAzul();
		
		String luz = bombilla.iluminar();
		
		System.out.println("ES UNA ... " + luz);

		
		
		bombilla = new BombillaRoja();
		
		luz = bombilla.iluminar();
		
		System.out.println("ES UNA ... " + luz);
		*/
		
		
		final Bombilla[] cajaBombillas = {new BombillaAzul(), 
											new BombillaRoja(), 
											new BombillaVerde(),
											new BombillaAmarilla()};
		
		
		
		final int numeroAleatorio = (int)(Math.random() * cajaBombillas.length);
		
		final Bombilla bombillaAleatoria = cajaBombillas[ numeroAleatorio ];		
	
		System.out.println(bombillaAleatoria.iluminar());		
		
	}
	
}
