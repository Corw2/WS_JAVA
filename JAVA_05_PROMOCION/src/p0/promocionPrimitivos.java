package p0;


public class PromocionPrimitivos {

	public static void main(String[] args) {
		
		/*
		byte b = 1;
		
		System.out.println("b = " + b);
		
		
		
		int x = b;		// AUTO-PROMOCIÓN DE byte A int.
		
		System.out.println("x = " + x);
		
		
		
		b = (byte)x;	// DESPROMOCIÓN REQUIERE DE UN CASTING FORZOSO POR EL PROGRAMADOR.
		
		System.out.println("b = " + b);
		*/
		
		
		
		
		
		/*
		
		char c = 'a';
 		
		System.out.println("c = " + c);
		
		System.out.println(c + " ---> " + (int)c);
		
		
		c++;
		
		//c = (char) (c + 1);
		
		
		System.out.println("INCREMENTAR EN +1");
		System.out.println("c = " + c);
		
		*/
		
		
		// MOSTRAR LAS 10 PRIMERAS LETRAS EMPEZANDO POR LA A:
		
		/*
		for(int letra=65; letra<65+10; letra++) {
			System.out.println((char)letra + " ---> " + letra);
		}
		*/
		
		
		/*
		for(char letra='A'; letra<'A'+10; letra++) {
			System.out.println(letra + " ---> " + (int)letra);
		}
		*/
		
		
		/*
		char letraInicio = 'M'; // SCANNER.
		
		
		for(char letra = letraInicio; letra<letraInicio+10; letra++) {
			System.out.println(letra + " ---> " + (int)letra);
		}
		*/
		
		/*
		// A(65) a(97)
		
		// A ... z
		
		for(char letra='A'; letra <= 'z'; letra++) {
			System.out.println(letra + " ---> " + (int)letra);
		}		
		*/
		
		
		
		/*
		int numeroInt = 0;
		
		byte numeroByte = (byte)numeroInt;
		*/
		
		
		
		byte maximoByte = 127;		
		System.out.println(maximoByte);	// +127
		maximoByte++;					// OVERFLOW ... DESBORDAMIENTO.
		System.out.println(maximoByte); // -128
		
	}
	
}
