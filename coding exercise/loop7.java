
/**
 * Write a description of class m here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop7{
    public static void main(String[] args){
      for(int x = 1;x <= 3;x++){
        for(int y = 3;y >= 1;y--){
          if(x == y){
            System.out.print("*");
            }else if(x != y){
            System.out.print(" ");
            }
        }System.out.println();
        }
    }
}
