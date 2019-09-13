
/**
 * クラス Question23 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Question31{
 //for loop
 //Start at 1
 public static void main(String[]args){
     //outter loop
 for(int i = 1 ; i <= 3;i++){
     //innerloop  
     for(int y = 1 ; y <= 3;y++){
     if(i+y ==4 || i+y ==5 || i+y ==6){
        System.out.print("*");
        }else if(i+y == 2 || i+y ==3){
        System.out.print(" ");
        }
      }
     System.out.println();
     }
  }
}
