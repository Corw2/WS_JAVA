package p1;


class Vehiculo {

}



class Coche extends Vehiculo {
	
}


class Moto extends Vehiculo {
	
}




class Prueba {
	
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo();
		
		Coche coche = new Coche();
		
		Moto moto = new Moto();
		
		// HANDLERS O MANEJADORES DEL OBJETO
		// =
		// EL OBJETO EN SÍ
		
		
		/*
		
		// ERROR, NO PUEDE MANEJAR DIRECTAMENTE UN SUPERTIPO CON EL SUBTIPO
		coche = vehiculo;
		
		moto = vehiculo;
		
		coche = moto;
		*/
		
		
		
		
		
		
		
		//vehiculo = moto;
		
		vehiculo = coche;
		
		moto = (Moto)vehiculo; // FORZANDO EL CASTING ... VIGILA QUE OBJETO HAY
		
		//moto = coche;
		
		
		// REALMENTE EN LA REFERENCIA DEL SUPERTIPO.
		/*
		Exception in thread "main" java.lang.ClassCastException: 
				p1.Coche cannot be cast to p1.Moto
					at p1.Prueba.main(Vehiculo.java:57)
		*/
		
		
		System.out.println("TODO OK !!!");
		
	}
	
}