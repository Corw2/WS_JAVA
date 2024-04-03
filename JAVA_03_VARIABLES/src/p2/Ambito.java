package p2;

public class Ambito {
	
	private int dinero = 500; //visible en metodo1 y metodo2 pero no fuera al ser private
	
	public void metodo1() {
		
		int x = 1; //local al metodo1
		System.out.println("X =" + x);
		//System.out.println("Y =" + y); //error es del metodo2
	}
	
	public void metodo2() {
		
		int y = 2;
		//System.out.println("X =" + x); //error es del metodo1
		System.out.println("Y =" + y);
		
	}
	
public static void main(String[] args) {
	
}
}
