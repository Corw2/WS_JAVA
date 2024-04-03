package p8;


public abstract class Bombilla { // NO SE PUEDE HACER new DE UNA CLASE ABSTRACTA.

	final int PRECIO = 1;
	
	
//	public Bombilla() {
//		super();
//	}
	
	
	public abstract String iluminar();	// NO ES ESTÁTICO ... ENTONCES ES POLIMÓRFICO == DEPENDE DEL OBJETO, NO DE LA REFERENCIA.
	
	
	public int consultarPrecio() {
		return PRECIO;
	}
	
	@Override
	public String toString() {
		return "ESTA ES UNA ... " + getClass().getSimpleName() +
					" Y VALE: " + PRECIO + " euros";
	}
	
	
}
