
/**
 * クラス loops24 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class loops24{
 //for loop
 //Start at 1
 public static void main(String[]args){
 for(int i = 1 ; i <= 14;i++){
     if(i % 2 == 0 && i <= 13){
         System.out.print("Pine ");
        }else if(i == 7 && i <= 13){
         System.out.print("Apple");
        }else if(i == 14){
         System.out.print("PineApple");
        }
        else{
         System.out.print(i + " ");
        }
        
    }
  }
}
