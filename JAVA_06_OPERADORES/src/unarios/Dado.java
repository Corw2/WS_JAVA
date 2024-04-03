package unarios;


public class Dado {

	public static void main(String[] args) {
		
		final int prohibido = 6;
		
		int dado;
		
		int dineroTotal = 0;
		
		
		
		while( (dado = (int)(Math.random() * 6 + 1)) != prohibido) {
			System.out.print(dado + " ");
			dineroTotal += dado;
		}
		
		
		System.out.println("\n");
		
		
		if(dineroTotal == 0) {
			System.out.println("UPSSS, NO HAS GANADO NADA");
			return;
		}
		
		
		System.out.println("DINERO GANADO = " + dineroTotal);
		
	}
	
}
