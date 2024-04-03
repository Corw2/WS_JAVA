package p5;

public class BitCoin {

	   private static final double VALOR_EUROS; //UNA CONSTANTE DE LA CLASE
	   private final int ID;
	   
	   static {
		   VALOR_EUROS = 59341.71;
	   }

	   public Bitcoin() {
	      //super();
	      ID = this.hashCode();
	   }

	   @Override
	   public String toString() {
	      return "BITCOIN: " + this.getClass().getSimpleName() + "\n" + "VALOR = " + this.Valor + "\n" + "PRECIO = " + this.precio + "\n" + "MATRICULA = " + this.matricula;
	   }

	 
	}


