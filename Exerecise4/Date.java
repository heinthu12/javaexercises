
/**
 * Write a description of class Date here.
 *
 * @author (Hein Thu
 * @version (31/01/2020)
 */
public class Date{
   private int year;
   private int month;
   private int day;
   public Date(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
   }
   public static void Birthday(Date b){
      System.out.print(b.year);
      System.out.print(b.month);
      System.out.print(b.day);
    }
}
