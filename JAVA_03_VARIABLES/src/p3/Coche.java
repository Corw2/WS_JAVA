package p3;

public class Coche {
	// Source code is decompiled from a .class file using FernFlower decompiler.
	package p3;

	public class Coche {
	   private final String MARCA = "FERRARI";
	   private final int PRECIO = 250000;

	   public Coche() {
	   }

	   public String toString() {
	      return "TIPO = " + this.getClass().getSimpleName() + "\n" + "MARCA = " + "FERRARI" + "\n" + "PRECIO = " + 250000;
	   }

	   public static void main(String[] args) {
	      Coche[] losCoches = new Coche[]{new Coche(), new Coche(), new Coche()};
	      Coche[] var5 = losCoches;
	      int var4 = losCoches.length;

	      for(int var3 = 0; var3 < var4; ++var3) {
	         Coche coche = var5[var3];
	         System.out.println(coche + "\n");
	      }

	   }
	}

	
}
