
/**
 * クラス l の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Question32{
 //for loop
 //Start at 1
    public static void main(String[]args){
     //outter loop
       for(int x = 1 ; x <= 3;x++){
           for(int y = 1 ; y <=3 ;y++){
        if(x <= y){
        System.out.print("*");
        }else if(x > y){
        System.out.print(" ");
          }
     }
     System.out.println();
     }
  }
}

