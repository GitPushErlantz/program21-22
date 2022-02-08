package inplementazioa;


public class FireMonster implements Monstruosoa {
   /** Constructs a FireMonster with the given name */
   public FireMonster(String name) {
      this.name = name;
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with fire!"; 
   }
}