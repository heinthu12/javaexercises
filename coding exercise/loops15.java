
/**
 * クラス loops15 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class loops15{
   public static void main(String[]args){
    for(int x = 3; x >= 1; x--) { // outer loop Pattern B
        //Inner Loop
     for(int i = 1; i <= x; i++) {
         
        System.out.print(i +" ");
    }
    System.out.println();
   }
 }
}
