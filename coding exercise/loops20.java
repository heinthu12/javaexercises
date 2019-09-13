
/**
 * クラス loops20 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class loops20{
    public static void main(String[] args){
      for(int x = 1;x <= 6;x++){
        for(int y = 1;y <= 6;y++){
          if(x == y){
            System.out.print(y + " ");
            }else{
            System.out.print(" ");
          }
        }System.out.println();
      }
   }
}

