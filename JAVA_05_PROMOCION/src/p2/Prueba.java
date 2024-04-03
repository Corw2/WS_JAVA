package p2;


public class Prueba {

	public static void main(String[] args) {
		
		// CLASE ABSTRACTA == NO SE PUEDE INSTANCIAR.
		//Animal animal = new Animal();
		
		
		// PROGRAMACIÓN EN BASE A UNA IMPLEMENTACIÓN ... MALLLLLL
		
		Gato gato = new Gato();
		String sonidoGato = gato.emitirSonido();
		System.out.println("EL GATO DICE ... " + sonidoGato);
		
		System.out.println("\n\n");
		
		Perro perro = new Perro();
		String sonidoPerro = perro.emitirSonido();
		System.out.println("EL PERRO DICE ... " + sonidoPerro);
		
		
		
		
		System.out.println("\n------------------------------------------------\n");
		
		
		
		
		// PROGRAMACIÓN EN BASE A UN SUPERTIPO ... BIEEENNNNNN.
		
		
		//Animal animal = gato; // perro.
		
		
		Animal[] animales = {gato, perro};
		
		
		Animal animal = animales[(int)(Math.random()*animales.length)]; // [0,1]
		
		
		System.out.println("EL ANIMAL DICE ... "  + animal.emitirSonido());		
		
		
		
		int valor = 0B1010; //012; // 0XFF;
		
		System.out.println(valor);
		
		
		
		
	}
	
}
