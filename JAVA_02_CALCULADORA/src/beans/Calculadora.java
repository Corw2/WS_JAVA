package beans;


public class Calculadora {
	
	/// OBTENER EL AREA DE UN CÍRCULO
	
	public static double areaCirculo(double radio) {
		
		// PI * r^2
		
		//return Math.PI * radio * radio;
		
		return Math.PI * Math.pow(radio, 2);
		
	}
	
	
	
	/// OBTENER LA PERÍMETRO DE UN CÍRCULO.
	public static double perimetroCirculo(double radio) {
		
		// 2 * PI * r
	
		return 2 * Math.PI * radio; 		
		
	}
	
	
}
