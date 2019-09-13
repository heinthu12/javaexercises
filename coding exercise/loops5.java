
/**
 * Write a description of class e here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loops5{
   public static void main(String[]args){
    for(int x = 0; x <=2; x++) { // outer loop Pattern B
     for(int i = 2; i >= x; i--) { //Inner Loop
        System.out.print("*");
    }
    System.out.println();
   }
 }
}

