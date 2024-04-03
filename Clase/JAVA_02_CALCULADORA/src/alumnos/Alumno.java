package alumnos;


import java.util.Scanner;

import beans.Calculadora;


public class Alumno {

	//static final int radio = 1;
	
	
	public static void main(String[] args) {
						
		//final double radio = 1;
		
		System.out.print("DIME EL RADIO ... ");
		
		Scanner sc = new Scanner(System.in);
		
		String cadenaLeida = sc.nextLine();
		
		sc.close();
		
		double radio = Double.parseDouble(cadenaLeida);
		

		
		final double area = Calculadora.areaCirculo(radio);
				
		final double perimetro = Calculadora.perimetroCirculo(radio);
		
		System.out.println("RADIO = " + radio);
		
		System.out.println("AREA = " + area);
		
		System.out.println("PERIMETRO = " + perimetro);
	}
	
}