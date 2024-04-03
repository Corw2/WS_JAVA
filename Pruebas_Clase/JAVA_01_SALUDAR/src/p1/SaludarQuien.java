package p1;

public class SaludarQuien {
	
	public static void main(String[] args) {
	
		if(args.length >= 1) {
			for(String amigo : args) {
				System.out.println ("Hola.. " + amigo);
				
			}
			
		} else {
			
			System.out.println ("¿A quien quieres que salude?");
			
		}

}
	
}
