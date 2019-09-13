
/**
 * クラス loops22 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class loop22{
    public static void main(String[] args){
      for(int x = 1;x <= 3;x++){
        for(int y = 3;y >= 1;y--){
          if(x % 2 == 1){
            System.out.print(x);
            }else if(x%2==0){
            System.out.print(" ");
            }
        }System.out.println();
        }
    }
}
