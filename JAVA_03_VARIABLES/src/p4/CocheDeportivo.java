// Source code is decompiled from a .class file using FernFlower decompiler.
package p4;

public class CocheDeportivo {
   private final String marca;
   private final int precio;
   private final int matricula;

   public CocheDeportivo(String marca, int precio) {
      this.marca = marca;
      this.precio = precio;
      this.matricula = this.hashCode();
   }

   public String toString() {
      return "TIPO = " + this.getClass().getSimpleName() + "\n" + "MARCA = " + this.marca + "\n" + "PRECIO = " + this.precio + "\n" + "MATRICULA = " + this.matricula;
   }

   public static void main(String[] args) {
      CocheDeportivo[] losCoches = new CocheDeportivo[]{new CocheDeportivo("Ferrari", 250000), new CocheDeportivo("Lamborgini", 160000)};
      CocheDeportivo[] var5 = losCoches;
      int var4 = losCoches.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         CocheDeportivo coche = var5[var3];
         System.out.println(coche + "\n");
      }

   }
}
