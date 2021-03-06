
/**
 * Write a description of class Tile here.
 *
 * @author (Hein THu)
 * @version (27/01/2020)
 */
public class Tile{
   private char letter;
   private int value;
   public Tile(char letter, int value){
      this.letter = letter;
      this.value = value;
   }
   public static void printTile(Tile tile){
      System.out.println("A tile with "+tile.letter+" and "+tile.value);
   }
   public static Tile testTile(){
      Tile tile = new Tile('Z',10);
      printTile(tile);
      return tile;
   }
   public String toString(){
      return "A tile with "+this.letter+" and "+this.value;
   }
   public boolean equals(Tile that){
      return this.letter == that.letter && this.value == that.value;
   }
   public char getLetter(){
      return this.letter;
   }
   public void setLetter(char letter){
      this.letter = letter;
   }
   public int getValue(){
      return this.value;
   }
   public void setValue(int value){
      this.value = value;
   }
}