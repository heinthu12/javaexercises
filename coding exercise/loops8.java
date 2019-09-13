
/**
 * クラス loops8 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class loops8{
    public static void main(String[] args){
      for(int x = 1;x <= 5;x++){
        for(int y = 5;y >= 1;y--){
          if(x == y || x+y == 6){
            System.out.print("*");
            }else if(x != y){
            System.out.print(" ");
            }
        }System.out.println();
        }
    }
}
